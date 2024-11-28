package com.example.softwarescrolling

object PersonalList {
    val personalList = listOf(
        Personal("Иван", "Иванов", "DEVELOPER"),
        Personal("Петр", "Петров", "ENGINEER"),
        Personal("Сидор", "Сидоров", "DOCTOR"),
        Personal("Василий", "Васильев", "TEACHER"),
        Personal("Анна", "Антонова", "DEVELOPER"),
        Personal("Мария", "Михайлова", "ENGINEER"),
        Personal("Алексей", "Алексеев", "DOCTOR"),
        Personal("Ольга", "Ольгина", "TEACHER"),
        Personal("Дмитрий", "Дмитриев", "DEVELOPER"),
        Personal("Елена", "Еленина", "ENGINEER"),
        Personal("Сергей", "Сергеев", "DOCTOR"),
        Personal("Татьяна", "Тихонова", "TEACHER"),
        Personal("Николай", "Николаев", "DEVELOPER"),
        Personal("Виктория", "Викторова", "ENGINEER"),
        Personal("Андрей", "Андреев", "DOCTOR"),
        Personal("Ксения", "Ксенофонтова", "TEACHER"),
        Personal("Роман", "Романов", "DEVELOPER"),
        Personal("Галина", "Галиева", "ENGINEER"),
        Personal("Станислав", "Станиславов", "DOCTOR"),
        Personal("Людмила", "Людмилова", "TEACHER"),
        Personal("Ярослав", "Ярославович", "DEVELOPER"),
        Personal("Олег", "Олегович", "ENGINEER"),
        Personal("Наталья", "Натальева", "DOCTOR"),
        Personal("Анастасия", "Анастасиева", "TEACHER"),
        Personal("Валерий", "Валерьевич", "DEVELOPER")
    ).shuffled() // Перемешиваем список

}