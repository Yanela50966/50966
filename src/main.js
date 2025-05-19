import { InputStream, CommonTokenStream, Token } from 'antlr4';
import { readFileSync } from 'fs';
import { Script, createContext } from 'vm';

import JavaScriptLexer from './parser/JavaScriptLexer.js';
import JavaScriptParser from './parser/JavaScriptParser.js';

// Leer el archivo de entrada
const input = readFileSync('./input/correcto1.txt', 'utf8');

// Lexer y parser
const chars = new InputStream(input);
const lexer = new JavaScriptLexer(chars);
const tokens = new CommonTokenStream(lexer);
const parser = new JavaScriptParser(tokens);

console.log("\n Tabla de lexemas y tokens:\n");

tokens.fill();
const tokenList = tokens.getTokens();

// Tabla de tokens
console.log("| LEXEMA        | TOKEN                    | LÍNEA | COLUMNA |");
console.log("|---------------|--------------------------|-------|---------|");

tokenList.forEach(token => {
    if (token.type !== Token.EOF) {
        const lexema = token.text.padEnd(14);
        const tokenType = parser.symbolicNames[token.type]?.padEnd(24) || "N/A".padEnd(24);
        const line = String(token.line).padEnd(5);
        const column = String(token.column).padEnd(7);
        console.log(`| ${lexema} | ${tokenType} | ${line} | ${column} |`);
    }
});

// Errores
parser.buildParseTrees = true;
parser.removeErrorListeners();
lexer.removeErrorListeners();

parser.addErrorListener({
    syntaxError: (recognizer, offendingSymbol, line, column, msg) => {
        console.error(`Error de sintaxis en línea ${line}, columna ${column}: ${msg}`);
    }
});

lexer.addErrorListener({
    syntaxError: (recognizer, offendingSymbol, line, column, msg) => {
        console.error(`Error léxico en línea ${line}, columna ${column}: ${msg}`);
    }
});

// Árbol sintáctico
const tree = parser.program();
console.log("\nÁrbol sintáctico:");
console.log(tree.toStringTree(parser.ruleNames));

// Interpretación
console.log("\n--- Interpretación del código fuente ---");
console.log("\nCódigo a interpretar:");
console.log(input);

console.log("\nResultado de la ejecución:");
try {
    const context = { console: console };
    createContext(context);
    const script = new Script(input);
    script.runInContext(context);
} catch (err) {
    console.error("Error durante la ejecución del código:", err.message);
}
function analizarArchivo(rutaArchivo) {
    console.log("\n===============================");
    console.log(`Analizando: ${rutaArchivo}`);
    console.log("===============================");

    const input = readFileSync(rutaArchivo, 'utf8');
    const chars = new InputStream(input);
    const lexer = new JavaScriptLexer(chars);
    const tokens = new CommonTokenStream(lexer);
    const parser = new JavaScriptParser(tokens);

    // Tabla de tokens
    tokens.fill();
    const tokenList = tokens.getTokens();

    console.log("\n📌 Tabla de lexemas y tokens:");
    console.log("| LEXEMA        | TOKEN                    | LÍNEA | COLUMNA |");
    console.log("|---------------|--------------------------|-------|---------|");

    tokenList.forEach(token => {
        if (token.type !== antlr4.Token.EOF) {
            const lexema = token.text.padEnd(14);
            const tokenType = parser.symbolicNames[token.type]?.padEnd(24) || "N/A".padEnd(24);
            const line = String(token.line).padEnd(5);
            const column = String(token.column).padEnd(7);
            console.log(`| ${lexema} | ${tokenType} | ${line} | ${column} |`);
        }
    });

    // Árbol y errores
    parser.buildParseTrees = true;
    parser.removeErrorListeners();
    lexer.removeErrorListeners();

    parser.addErrorListener({
        syntaxError: (recognizer, offendingSymbol, line, column, msg) => {
            console.error(` Error de sintaxis en línea ${line}, columna ${column}: ${msg}`);
        }
    });

    lexer.addErrorListener({
        syntaxError: (recognizer, offendingSymbol, line, column, msg) => {
            console.error(` Error léxico en línea ${line}, columna ${column}: ${msg}`);
        }
    });

    const tree = parser.program();
    console.log("\n Árbol sintáctico:");
    console.log(tree.toStringTree(parser.ruleNames));

    // Interpretación
    console.log("\n Interpretación del código:");
    try {
        const context = { console: console };
        createContext(context);
        const script = new Script(input);
        script.runInContext(context);
    } catch (err) {
        console.error("Error durante la ejecución:", err.message);
    }

    console.log("\n");
}
analizarArchivo('./input/correcto1.txt');
analizarArchivo('./input/correcto2.txt');
analizarArchivo('./input/incorrect1.txt');
analizarArchivo('./input/incorrect2.txt');



