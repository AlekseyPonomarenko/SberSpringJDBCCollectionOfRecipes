package run;

import dao.CategoryReceptDao;
import dao.ReceptDao;
import model.CategoryRecept;
import model.Ingridient;
import model.Recept;

import java.util.ArrayList;
import java.util.List;

public class FillDemo {

    public void fillDemo(CategoryReceptDao categoryReceptDao, ReceptDao receptDao){

        CategoryRecept categoryRecept;
        List <Ingridient> ingridients;
        Recept recept;

        //Первые блюда
        categoryRecept = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Первые блюда"));

        //Африканский куриный суп
        recept = Recept.receptCreate(categoryRecept, "Африканский куриный суп", "Большую часть горошка отварить до мягкости в курином бульоне и протереть через сито вместе с бульоном. Меньшую часть гороха оставить на ночь, обсушить." +
                "Мелко нарубленный лук обжарить в сливочном масле, добавить очищенное и мелко нарезанное яблоко и потушить. Затем уменьшить огонь, добавить порошок карри и дать покипеть 3-4 минуты. Посыпать мукой, перемешать и залить бульоном." +
                "Высушенный горошек пассеровать отдельно  и добавить туда же. Оставить на 10 минут покипеть, затем посолить и поперчить. В готовый суп добавить небольшое количество целых зеленых горошин и сливки.");

        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("лук репчатый", 2, "шт"));
        ingridients.add(Ingridient.create("масло сливочное", 3, "ст.л."));
        ingridients.add(Ingridient.create("яблоко", 1, "шт."));
        ingridients.add(Ingridient.create("порошок карри", 1, "ч.л."));
        ingridients.add(Ingridient.create("мука", 1, "ст.л."));
        ingridients.add(Ingridient.create("бульон куриный", 500, "мл"));
        ingridients.add(Ingridient.create("горошек зеленый", 500, "г"));
        ingridients.add(Ingridient.create("сливки", 1, "г"));
        ingridients.add(Ingridient.create("соль, перец", 0, "по вкусу"));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);

        //Апельсиновый суп
        recept = Recept.receptCreate(categoryRecept, "Апельсиновый суп", "Крахмал развести в холодной воде и добавить сахар. Апельсины очистить, разделить на дольки и снять кожицу. Очищенную мякоть положить в кастрюлю и слегка подавить. Добавить разведенный крахмал с сахаром и быстро вскипятить. Разлить по тарелкам, украсить вишнями. Подавать горячим.");
        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("апельсины", 3, "шт. больших"));
        ingridients.add(Ingridient.create("сахар", 6, "ст.л."));
        ingridients.add(Ingridient.create("вода", 1, "л"));
        ingridients.add(Ingridient.create("крахмал кукурузный", 3, "ст.л."));
        ingridients.add(Ingridient.create("вишни", 10, "шт."));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);

        //Борщ белорусский
        recept = Recept.receptCreate(categoryRecept, "Борщ белорусский", "Кости от ветчины сварить вместе с говяжьей грудинкой. Морковь, петрушку и лук нарезать соломкой и пассеровать на свином сале 10 минут, затем добавить томатную пасту и пассеровать еще 10 минут. Свеклу сварить в кожуре, очистить и нашинковать. В бульон положить картофель нарезанный дольками, довести до кипения, положить вареную свеклу, пассерованные муку, коренья, лук, лавровый лист, соль, перец и варить еще 10 минут. В конце заправить борщ сахаром и уксусом. При подаче положить в тарелки мясо, сосиски, сметану и посыпать зеленью.");
        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("грудинка говяжья", 3, "шт. больших"));
        ingridients.add(Ingridient.create("сосиски", 6, "ст.л."));
        ingridients.add(Ingridient.create("свекла средняя", 1, "л"));
        ingridients.add(Ingridient.create("картофель", 3, "ст.л."));
        ingridients.add(Ingridient.create("морковь", 10, "шт."));
        ingridients.add(Ingridient.create("корень петрушки", 3, "ст.л."));
        ingridients.add(Ingridient.create("луковица", 10, "шт."));
        ingridients.add(Ingridient.create("паста томатная", 3, "ст.л."));
        ingridients.add(Ingridient.create("сахар", 10, "шт."));
        ingridients.add(Ingridient.create("сметана", 3, "ст.л."));
        ingridients.add(Ingridient.create("зелень", 10, "шт."));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);

        //Вторые блюда
        categoryRecept = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Вторые блюда"));

        //Баранина по-турецки
        recept = Recept.receptCreate(categoryRecept, "Баранина по-турецки", "Мясо нарезать небольшими кусочками и положить в посуду. Добавить нарезанный лук, масло, соль, перец. Тушить под крышкой 8 - 9 минут при мощности 100% (900 вт).Помидоры без кожуры нарезать и добавить к мясу. Все перемешать и прогревать ещё 3,5 - 4 минуты. При мощности 50% (450 вт). Баклажаны испечь на открытом огне, на");
        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("грудинка говяжья", 3, "шт. больших"));
        ingridients.add(Ingridient.create("сосиски", 6, "ст.л."));
        ingridients.add(Ingridient.create("свекла средняя", 1, "л"));
        ingridients.add(Ingridient.create("картофель", 3, "ст.л."));
        ingridients.add(Ingridient.create("морковь", 10, "шт."));
        ingridients.add(Ingridient.create("корень петрушки", 3, "ст.л."));
        ingridients.add(Ingridient.create("луковица", 10, "шт."));
        ingridients.add(Ingridient.create("паста томатная", 3, "ст.л."));
        ingridients.add(Ingridient.create("сахар", 10, "шт."));
        ingridients.add(Ingridient.create("сметана", 3, "ст.л."));
        ingridients.add(Ingridient.create("зелень", 10, "шт."));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);

        //Бифштекс
        recept = Recept.receptCreate(categoryRecept, "Бифштекс", "Из утолщенной части филейной вырезки нарезать порционные куски толщиной 2-3 см и отбить до толщины 1-2 см, придавая им овальную или округлую форму. Перед жаркой посыпать мясо солью и перцем. Жарить мясо в небольшом сотейнике или порционной сковороде на сливочном масле или маргарине в течение 7-15 минут. Готовый бифштекс положить на тарелку, полить маслом и мясным соком. На гарнир подойдет жаренный картофель и строганный хрен.");
        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("грудинка говяжья", 3, "шт. больших"));
        ingridients.add(Ingridient.create("сосиски", 6, "ст.л."));
        ingridients.add(Ingridient.create("свекла средняя", 1, "л"));
        ingridients.add(Ingridient.create("картофель", 3, "ст.л."));
        ingridients.add(Ingridient.create("морковь", 10, "шт."));
        ingridients.add(Ingridient.create("корень петрушки", 3, "ст.л."));
        ingridients.add(Ingridient.create("луковица", 10, "шт."));
        ingridients.add(Ingridient.create("паста томатная", 3, "ст.л."));
        ingridients.add(Ingridient.create("сахар", 10, "шт."));
        ingridients.add(Ingridient.create("сметана", 3, "ст.л."));
        ingridients.add(Ingridient.create("зелень", 10, "шт."));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);

        //Цыпленок по-королевски
        recept = Recept.receptCreate(categoryRecept, "Цыпленок по-королевски", "Сладкий перец и грибы очистить, промыть, обсушить, нарезать крупными кубиками и обжарить на сковороде в растительном масле. Добавить сливки и дать закипеть. Куриное филе нарезать соломкой, присыпать специями и добавить к овощам. Тушить до готовности.");
        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("грудинка говяжья", 3, "шт. больших"));
        ingridients.add(Ingridient.create("сосиски", 6, "ст.л."));
        ingridients.add(Ingridient.create("свекла средняя", 1, "л"));
        ingridients.add(Ingridient.create("картофель", 3, "ст.л."));
        ingridients.add(Ingridient.create("морковь", 10, "шт."));
        ingridients.add(Ingridient.create("корень петрушки", 3, "ст.л."));
        ingridients.add(Ingridient.create("луковица", 10, "шт."));
        ingridients.add(Ingridient.create("паста томатная", 3, "ст.л."));
        ingridients.add(Ingridient.create("сахар", 10, "шт."));
        ingridients.add(Ingridient.create("сметана", 3, "ст.л."));
        ingridients.add(Ingridient.create("зелень", 10, "шт."));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);

        //Напитки
        categoryRecept = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Напитки"));

        //Алый праздничный компот
        recept = Recept.receptCreate(categoryRecept, "Алый праздничный компот", "Яблоки очистить и вырезать сердцевину (оставив плоды целыми) и положить в холодную, подкисленную  (1 ч л) уксусом воду на 5-6 минут, чтобы не потемнели. В эмалированную кастрюлю налить воду, добавить все пряности, предварительно раздавив их, довести до кипения и дать покипеть 5 минут. Затем добавить туда яблоки, сахар, каркаде и варить на медленном огне 10-12 минут, в зависимости от сорта яблок, но не более 15 минут, так как яблоки должны остаться целыми. В конце варки влить 1 ст л уксуса (или сок одного лимона) и через 20 секунд выключить. Закрыть крышкой и дать остыть.");
        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("грудинка говяжья", 3, "шт. больших"));
        ingridients.add(Ingridient.create("сосиски", 6, "ст.л."));
        ingridients.add(Ingridient.create("свекла средняя", 1, "л"));
        ingridients.add(Ingridient.create("картофель", 3, "ст.л."));
        ingridients.add(Ingridient.create("морковь", 10, "шт."));
        ingridients.add(Ingridient.create("корень петрушки", 3, "ст.л."));
        ingridients.add(Ingridient.create("луковица", 10, "шт."));
        ingridients.add(Ingridient.create("паста томатная", 3, "ст.л."));
        ingridients.add(Ingridient.create("сахар", 10, "шт."));
        ingridients.add(Ingridient.create("сметана", 3, "ст.л."));
        ingridients.add(Ingridient.create("зелень", 10, "шт."));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);

        //Ягодный квас
        recept = Recept.receptCreate(categoryRecept, "Ягодный квас", "Взять 1кг различных ягод (малина, ежевика, черника, брусника). Ягоды размять и залить 4,5л теплого сахарного сиропа (на 1л воды – 150г сахара), размешать, накрыть сосуд марлей и выдержать сутки при температуре 20-25*С. Затем содержимое процедить и разлить в бутылки, вбросив туда по несколько изюминок (бутылки наполнять так, чтобы уровень жидкости был на 5-6см ниже верха горлышка). Укупорить пробками и выдержать в холодном месте  10-14 дней. Вот тогда вкусный напиток будет готов.");
        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("грудинка говяжья", 3, "шт. больших"));
        ingridients.add(Ingridient.create("сосиски", 6, "ст.л."));
        ingridients.add(Ingridient.create("свекла средняя", 1, "л"));
        ingridients.add(Ingridient.create("картофель", 3, "ст.л."));
        ingridients.add(Ingridient.create("морковь", 10, "шт."));
        ingridients.add(Ingridient.create("корень петрушки", 3, "ст.л."));
        ingridients.add(Ingridient.create("луковица", 10, "шт."));
        ingridients.add(Ingridient.create("паста томатная", 3, "ст.л."));
        ingridients.add(Ingridient.create("сахар", 10, "шт."));
        ingridients.add(Ingridient.create("сметана", 3, "ст.л."));
        ingridients.add(Ingridient.create("зелень", 10, "шт."));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);

        //Клубничный лимонад
        recept = Recept.receptCreate(categoryRecept, "Клубничный лимонад", "Отложить несколько ягод клубники. Остальную измельчить в блендере, добавив воду, лимонный сок, сахар. Разлить пюре по стаканам, добавить минеральную воду и лед. Стаканы украсить целыми ягодами.");
        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("грудинка говяжья", 3, "шт. больших"));
        ingridients.add(Ingridient.create("сосиски", 6, "ст.л."));
        ingridients.add(Ingridient.create("свекла средняя", 1, "л"));
        ingridients.add(Ingridient.create("картофель", 3, "ст.л."));
        ingridients.add(Ingridient.create("морковь", 10, "шт."));
        ingridients.add(Ingridient.create("корень петрушки", 3, "ст.л."));
        ingridients.add(Ingridient.create("луковица", 10, "шт."));
        ingridients.add(Ingridient.create("паста томатная", 3, "ст.л."));
        ingridients.add(Ingridient.create("сахар", 10, "шт."));
        ingridients.add(Ingridient.create("сметана", 3, "ст.л."));
        ingridients.add(Ingridient.create("зелень", 10, "шт."));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);

        //Салаты
        categoryRecept = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Салаты"));

        //Японский  фруктово-овощной салат
        recept = Recept.receptCreate(categoryRecept, "Японский  фруктово-овощной салат", "Кусочки ананаса, некрупно нарезанные помидоры и апельсины разрезанные пополам, мелко нарезанный имбирь смешать с соком лимона, солью, сахаром и поставить в холодильник. Перед самой подачей к столу все выложить на листья салата и полить смесью из сливок, сока лимона и сахара.");
        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("грудинка говяжья", 3, "шт. больших"));
        ingridients.add(Ingridient.create("сосиски", 6, "ст.л."));
        ingridients.add(Ingridient.create("свекла средняя", 1, "л"));
        ingridients.add(Ingridient.create("картофель", 3, "ст.л."));
        ingridients.add(Ingridient.create("морковь", 10, "шт."));
        ingridients.add(Ingridient.create("корень петрушки", 3, "ст.л."));
        ingridients.add(Ingridient.create("луковица", 10, "шт."));
        ingridients.add(Ingridient.create("паста томатная", 3, "ст.л."));
        ingridients.add(Ingridient.create("сахар", 10, "шт."));
        ingridients.add(Ingridient.create("сметана", 3, "ст.л."));
        ingridients.add(Ingridient.create("зелень", 10, "шт."));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);

        //Индийский салат из картофеля и кокосового ореха
        recept = Recept.receptCreate(categoryRecept, "Индийский салат из картофеля и кокосового ореха", "Картофель отваренный в мундире очистить, нарезать кубиками. Йогурт смешать с солью и кокосовой стружкой. Топленое масло разогреть в сковороде, бросить в него семена горчицы и накрыть крышкой. Через минуту добавить мелко натертый имбирь и измельченный перец. Помешивать полминуты, и добавить пряности в йогуртовую смесь. Все тщательно перемешать и охладить. Помидоры нарезать дольками, петрушку измельчить. Ингредиенты соединить заправить соусом из йогурта и посыпать петрушкой.");
        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("грудинка говяжья", 3, "шт. больших"));
        ingridients.add(Ingridient.create("сосиски", 6, "ст.л."));
        ingridients.add(Ingridient.create("свекла средняя", 1, "л"));
        ingridients.add(Ingridient.create("картофель", 3, "ст.л."));
        ingridients.add(Ingridient.create("морковь", 10, "шт."));
        ingridients.add(Ingridient.create("корень петрушки", 3, "ст.л."));
        ingridients.add(Ingridient.create("луковица", 10, "шт."));
        ingridients.add(Ingridient.create("паста томатная", 3, "ст.л."));
        ingridients.add(Ingridient.create("сахар", 10, "шт."));
        ingridients.add(Ingridient.create("сметана", 3, "ст.л."));
        ingridients.add(Ingridient.create("зелень", 10, "шт."));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);

        //Классический винегрет
        recept = Recept.receptCreate(categoryRecept, "Классический винегрет", "Свеклу, морковь, картофель вымыть, обсушить, завернуть в два слоя фольги и запекать в духовке 1 час, затем дать остыть, очистить от кожуры, нарезать кубиками. Добавить нарезанное кубиками яблоко,предварительно его сбрызнуть уксусом. Нарезать луковицу и добавить к овощам. Перемешать. Огурцы нарезать кубиками и вместе с выделившимся рассолом добавить в салат. Выложить квашеную капусту и процеженный горошек. Свеклу нарезать кубиками, посыпать сахаром и сбрызнуть уксусом. Все соединить, заправить солью, перцем и маслом. перемешать.");
        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("грудинка говяжья", 3, "шт. больших"));
        ingridients.add(Ingridient.create("сосиски", 6, "ст.л."));
        ingridients.add(Ingridient.create("свекла средняя", 1, "л"));
        ingridients.add(Ingridient.create("картофель", 3, "ст.л."));
        ingridients.add(Ingridient.create("морковь", 10, "шт."));
        ingridients.add(Ingridient.create("корень петрушки", 3, "ст.л."));
        ingridients.add(Ingridient.create("луковица", 10, "шт."));
        ingridients.add(Ingridient.create("паста томатная", 3, "ст.л."));
        ingridients.add(Ingridient.create("сахар", 10, "шт."));
        ingridients.add(Ingridient.create("сметана", 3, "ст.л."));
        ingridients.add(Ingridient.create("зелень", 10, "шт."));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);

        //Десерты, сладкие блюда
        categoryRecept = categoryReceptDao.createCategoryRecept(CategoryRecept.create("Десерты, сладкие блюда"));

        //Белевская пастила
        recept = Recept.receptCreate(categoryRecept, "Белевская пастила", "Яблоки перебрать, промыть, запечь в духовке, очистить от кожицы, протереть через сито дважды. Пюре взбивать до тех пор, пока оно не побелеет и увеличится в объеме, добавить сахар и продолжать взбивать 15-20 минут. Затем соединить со взбитыми белками и еще 5 минут взбивать. Пюре разложить слоем 2-3 см на лотки, выстеленные пергаментом, слегка посыпать сахарной пудрой, сверху пласт разгладить ножом. Сушить в духовке при температуре 60-70 *С, затем 40-50 *С. Спустя 5-6 часов пласт разрезать на куски, еще подсушить в течение 1-2 часов, затем перевернуть и подсушить окончательно. Часть яблочного пюре можно заменить сливовым, вишневым, земляничным, рябиновым и т.д. Белевская пастила получается пышной и вкусной.");
        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("грудинка говяжья", 3, "шт. больших"));
        ingridients.add(Ingridient.create("сосиски", 6, "ст.л."));
        ingridients.add(Ingridient.create("свекла средняя", 1, "л"));
        ingridients.add(Ingridient.create("картофель", 3, "ст.л."));
        ingridients.add(Ingridient.create("морковь", 10, "шт."));
        ingridients.add(Ingridient.create("корень петрушки", 3, "ст.л."));
        ingridients.add(Ingridient.create("луковица", 10, "шт."));
        ingridients.add(Ingridient.create("паста томатная", 3, "ст.л."));
        ingridients.add(Ingridient.create("сахар", 10, "шт."));
        ingridients.add(Ingridient.create("сметана", 3, "ст.л."));
        ingridients.add(Ingridient.create("зелень", 10, "шт."));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);

        //Бразильский десерт из бананов
        recept = Recept.receptCreate(categoryRecept, "Бразильский десерт из бананов", "Сахар и какао смешать. Бананы очистить и обвалять в массе из какао. Сверху посыпать орехами. Кроме того, сверху блюдо покрыть взбитыми сливками.");
        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("грудинка говяжья", 3, "шт. больших"));
        ingridients.add(Ingridient.create("сосиски", 6, "ст.л."));
        ingridients.add(Ingridient.create("свекла средняя", 1, "л"));
        ingridients.add(Ingridient.create("картофель", 3, "ст.л."));
        ingridients.add(Ingridient.create("морковь", 10, "шт."));
        ingridients.add(Ingridient.create("корень петрушки", 3, "ст.л."));
        ingridients.add(Ingridient.create("луковица", 10, "шт."));
        ingridients.add(Ingridient.create("паста томатная", 3, "ст.л."));
        ingridients.add(Ingridient.create("сахар", 10, "шт."));
        ingridients.add(Ingridient.create("сметана", 3, "ст.л."));
        ingridients.add(Ingridient.create("зелень", 10, "шт."));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);

        //Десерт «Шоколадный бум»
        recept = Recept.receptCreate(categoryRecept, "Десерт «Шоколадный бум»", "Желатин залить 150 мл молока, размешать и оставить для набухания. Вылить оставшееся молоко в эмалированную кастрюлю, всыпать сахар и поставить на плиту. Шоколад поломать, выложить в молочную массу. Прогреть смесь на слабом огне до растворения шоколада, не доводя до кипения. Набухший желатин распустить на водяной бане. Снять обе емкости с плиты, через ситечко влить желатиновый раствор в шоколадную массу. Хорошо размешать. Распределить смесь по формочкам и отправить в холодильник до застывания. При подаче украсить кусочками апельсина.");
        ingridients = new ArrayList();
        ingridients.add(Ingridient.create("темный шоколад", 3, "шт. больших"));
        ingridients.add(Ingridient.create("молоко", 6, "ст.л."));
        ingridients.add(Ingridient.create("сахар", 1, "л"));
        ingridients.add(Ingridient.create("желатин", 3, "ст.л."));
        ingridients.add(Ingridient.create("апельсин (д/украшен.)\t", 10, "шт."));
        recept.setIngridients(ingridients);
        receptDao.createRecept(recept);
    }
}
