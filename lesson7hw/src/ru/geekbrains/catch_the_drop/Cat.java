package ru.geekbrains.catch_the_drop;


//1.Расширить задачу про котов и тарелки с едой.
//2.Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//3.Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
//4.Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//5.Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
//6.Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.



public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;
    public Cat(String name, int appetite, boolean fullness) { //Задание 3. Добавляем поле аппетит каждому коту
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }
    public void eat(Plate p) {
        if (appetite <= p.getFood()){
            p.decreaseFood(appetite);
            fullness = true;
        } else {
            System.out.println(name + " не стал есть и остался голодным"); //Задание 4.Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
            fullness = false;
        }
    }
    public void fullnessInfo(){
        if (fullness != false) {
            System.out.println(name + " сыт");
        } else {
            System.out.println(name + " голодный");
        }
    }
}
