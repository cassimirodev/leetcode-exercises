class Solution {
    public boolean isValid(String s) {
        

        // um loop vai tirar de dentro pra fora e substituir com uma string vazia, se estiver dentro do padrao, no return s.isEmpty retorna true pois o padrao esta correto
        while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
            s = s.replace("{}", "");
            s = s.replace("()", "");
            s = s.replace("[]", "");
        }
        
        return s.isEmpty();
    }
}