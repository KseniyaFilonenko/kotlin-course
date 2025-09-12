package org.example.lessons.lesson03

class Homework {

    //1. Название мероприятия
    val eventName: String = "Hackathon Survival"
    //2. Дата проведения
    var date: String = "31 Dec 2025"
    //3. Место проведения
    var place: String = "Minsk, address1"
    //4. Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
    private val detailedBudget: String = ""
    //5. Количество участников
    var qtyOfMembers: Int = 0
    //6. Длительность хакатона
    val eventLength: Int = 2
    //7. Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
    private val contactInfoAndDeal: String = "Contact info and Document with all main points"
    //8. Текущее состояние хакатона (статус)
    var eventStatus: String = "Not started"
    //9. Список спонсоров
    val sponsorsList: String = "List of sponsors"
    //10. Бюджет мероприятия
    private val generalBudget: Int = 100
    //11. Текущий уровень доступа к интернету
    var internetAccessability: String = "high"
    //12. Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
    private val logisticInfo: String = "logistic info"
    //13. Количество команд
    var qtyOfTeams: Int = 0
    //14. Перечень задач
    val tasksList: String = "tasks list"
    //15. План эвакуации
    var evacuationPlan: String = "evacuation plan"
    //16. Список доступного оборудования (всё, что выделено для использования на мероприятии)
    val equipmentList: String = "equipment list"
    //17. Список свободного оборудования (всё, что можно взять прямо сейчас и что не занято другими участниками)
    var freeEquipmentList: String = "free equipment list"
    //18. График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
    lateinit var eatingPlan: String
    //19. План мероприятий на случай сбоев
    val emergencyPlan: String = "emergency plan"
    //20. Список экспертов и жюри
    var expertsList: String = "experts list"
    //21. Политика конфиденциальности
    val privacyPolicy: String = "privace policy"
    //22. Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
    private lateinit var feedback: String
    //23. Текущая температура в помещении
    var currentTemperature: Int = 22
    //24. Данные мониторинга и анализ производительности сетевого оборудования и интернет-соединения для целей отладки своих приложений командами
    var monitoringValuesAndPerfomanceAnalysis: String = "monitoring values and perfomance analysis"
    //25. Регулятор скорости интернета
    val netSpeedRegulation: String = "internet speed regulation"
    //26. Уровень освещения
    var lightLevel: Int = 100
    //27. Лог событий мероприятия
    lateinit var eventLog: String
    //28. Возможность получения медицинской помощи прямо на мероприятии (да/нет)
    val medicHelp: Boolean = true
    //29. Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
    val savePlan: String = "save plan"
    //30. Регистрационный номер мероприятия
    val eventRegisteredNumber: Int = 1236543
    //31. Максимально допустимый уровень шума в помещении хакатона.
    val maxNoiseLevel: Int = 80
    //32. Индикатор превышения уровня шума в помещениях (превышен или не превышен в данный момент)
    var noiseIndicator: Boolean = true
    //33. План взаимодействия с прессой
    val pressPlan: String = "press plan"
    //34. Детальная публичная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
    lateinit var projectsDescription: String
    //35. Статус получения всех необходимых разрешений для проведения мероприятия
    var passStatus: String = "in progress"
    //36. Индикатор доступности специализированного оборудования в данный момент (например, специальному оборудованию)
    var isSpecialEquipmentAvailable: Boolean = false
    //37. Список партнеров мероприятия
    var partners: String = "partners"
        private set
    //38. Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
    val report: String by lazy {
        ""
    }
    //39. Внутренние правила распределения призов
    var prizeRules: String = "prize rules"
    //40. Список разыгрываемых призов
    val prizes: String = "prizes"
    //41. Контактная информация экстренных служб, медицинского персонала и других важных служб, для внутреннего пользования.
    val emergencyContacts: String = "emergency contacts"
    //42. Особые условия для участников с ограниченными возможностями
    val specialConditions: String = "special conditions"
    //43. Общее настроение участников (определяется опросами)
    var participantsMood: String = ""
    //44. Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия,
    // так как зависит от фактического состава команд и взятых в работу задач.
    lateinit var hachatonPlan: String
    //45. Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия, но в момент инициализации неизвестно.
    lateinit var specialGuest: String
    //46. Максимальное количество людей, которое может вместить место проведения.
    val maxMembersQty: Int = 150
    //47. Количество часов, отведенное каждой команде для работы над проектом.
    val hoursPerTeam: Int = 1
}