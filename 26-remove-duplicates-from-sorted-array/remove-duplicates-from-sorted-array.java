class Solution {
    public int removeDuplicates(int[] nums) {


        // declaro um set de vistos no qual armazena os numeros vistos de nums
        HashSet<Integer> vistos = new HashSet<>();
        // crio uma lista coms os duplicados
        List<Integer> duplicados = new ArrayList<>();


        // for each na lista, se for diferente de de vistos, ele é adicionado no duplicados
        for (int i : nums) {
            if (!vistos.add(i)) {
                duplicados.add(i);
            }
        }

        // crio uma nova lista e adiciono os valores do hashset e ordeno
        List<Integer> vistosLista = new ArrayList<>(vistos);
        Collections.sort(vistosLista);


        // crio um array primitivo com o tamanho da lista de vistos
        int[] newNums = new int[vistosLista.size()];

        // laço para modificar o nums[i] sem criar outro array, ou seja array in-place
        for (int i = 0; i < vistosLista.size(); i++) {
            nums[i] = vistosLista.get(i); 
        }

        // retorna a quantidade de numeros uncios ja ordenados na nova lista que contem os valores do hashset
        return vistosLista.size(); 
    }
}