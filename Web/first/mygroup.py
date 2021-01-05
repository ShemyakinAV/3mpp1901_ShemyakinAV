groupmates = [
    {
        "name": "Александр",
        "surname": "Иванов",
        "exams": ["Информатика", "ЭЭиС", "Web"],
        "marks": [4, 3, 5]
    },
    {
        "name": "Иван",
        "surname": "Петров",
        "exams": ["История", "АиГ", "КТП"],
        "marks": [4, 4, 4]
    },
    {
        "name": "Кирилл",
        "surname": "Смирнов",
        "exams": ["Философия", "ИС", "КТП"],
        "marks": [5, 5, 5]
    },
        {
        "name": "Дмитрий",
        "surname": "Михайлов",
        "exams": ["Математика", "МИ", "ЕРТ"],
        "marks": [3, 5, 3]
    },
        {
        "name": "Сергей",
        "surname": "Попов",
        "exams": ["БЖД", "БД", "БОТ"],
        "marks": [5, 4, 3]
    }
]

def print_students(students):
    user_text = input("Введите оценку: ")
    user_mark = int(user_text)
    print(u"Имя".ljust(15), u"Фамилия".ljust(10), u"Экзамены".ljust(30), u"Средний балл".ljust(20))
    
    for student in students:
        normal_mark = int(sum(student["marks"])/len(student["marks"]))
        if(normal_mark == user_mark):
            print(student["name"].ljust(15), student["surname"].ljust(10), str(student["exams"]).ljust(30), str(normal_mark).ljust(20))
print_students(groupmates)

