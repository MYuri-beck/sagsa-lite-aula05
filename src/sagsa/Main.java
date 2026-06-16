package sagsa;

import sagsa.data.FakeExcelRepository;
import sagsa.data.RepositoryContrato;
import sagsa.core.GeradorEstrategiaCore;
import sagsa.view.TerminalInterface;

public class Main {

    public static void main(String[] args) {

        RepositoryContrato bancoDados =
            new FakeExcelRepository();

        GeradorEstrategiaCore core =
            new GeradorEstrategiaCore(bancoDados);

        TerminalInterface interfaceUsuario =
            new TerminalInterface(core);

        interfaceUsuario.renderizarJanelaTerminal();
    }
}
