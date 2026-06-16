# SAGSA-Lite

Sistema de Apoio à Geração de Situações de Aprendizagem — versão Lite.

Laboratório prático focado em **Mapeamento de Subsistemas**, **Alta Coesão** e **Acoplamento Fraco**.

## Estrutura

```
src/
└── sagsa/
    ├── core/      → Regras de negócio
    ├── data/      → Persistência de dados
    ├── view/      → Interface via terminal
    └── Main.java  → Inicialização
```

## Como compilar e executar

```bash
# Compilar
javac -d out -sourcepath src src/sagsa/Main.java

# Executar
java -cp out sagsa.Main
```

## Commits

| Commit | Descrição |
|--------|-----------|
| feat   | Implementação base com FakeExcelRepository |
| refactor | Troca para BancoDadosRealRepository (Nuvem SQL) |
