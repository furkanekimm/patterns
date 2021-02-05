# DESIGN PATTERNS

- Prototype
- Adapter
- Front Controller
- Template
- Observer
- Singleton
- Factory Method
- Strategy
- Facade

## Singleton Pattern

Creational Design Pattern kategorisindedir. Amacı bir class’tan sadece bir tane instance yaratılmasını sağlar.  Pattern uygulandıktan sonra eğer herhangi bir classtan instance yaratılmaya çalışılırsa eğer daha öncesinde bir instance yaratılmışsa onu kullanılır. Fakat bir instance yok ise yeni oluşturulur.
Yapı genel itibari ile ikiye ayrılır. Bunlar;
Early Instantiation: Program çalıştırıldığında bir instance oluşturulur.
Lazy Instantiation: İhtiyaç olduğunda instance oluşturulur.

### Avantajları

Class’tan instance yaratıldığında bir kere hafıza da yer kaplar ve daha sonrasında herhangi bir instance yaratıldığında ilk varolan instance kullanılır ve bu sayede tek instance yardımı ile kullanmak istediğimiz classlarda bize yardımcı olur.

### Nasıl Singleton Design Pattern Oluştururuz?

Bunun için ise ;
Static Member
Static olduğu çalışma zamanında bir kere kullanılır ve Singleton class’ın instance’ını içerir.
Private Constructor
Constructorın private olması bize class’ın dışarıdan instance oluşturmasını engellememizi sağlar.
Static Factory Method
Singleton objesine erişmemizi sağlar ve bize instance’ı döndürür.

## Facade Pattern

Facade ile karmaşık alt sistemlere sahip bir yapıyı , tek bir arayüz yardımı oluşturarak basitleştirmemizi sağlar. Facade classımıza herhangi bir bağımlılıkları yoktur. Ayrı ayrı da çalışabilmektedirler fakat bu pattern bize tek bir çatı altında kullanmamızı sağlar.

## Factory Method Pattern

Factory Method Pattern aynı abstract sınıf ya da interface’den türeyen nesnelerin üretiminden sorumlu yapıdır. Burada kalıtım yoluyla sub-class’lara yoluyla nesne yaratma amaçlanır. Örnek verecek olursak bir bayiden telefon satıyoruz ve herbiri farklı marka telefonlar bayi telefonu depo dan alır ve depo bayiye hepsini sunmaktadır . Burada factory Depo olmakta ve herbirinden tek tek instance yaratmak yerine tek bir noktadan bunların tedarikini yapabilmektedir.

## Strategy Pattern

Yazılım yaparken işlemlerimizi gerçekleştirmek için birden fazla yöntem mevcut olabilir. İstenilen duruma göre bir yöbtem seçilerek, bunu uygulamak için strategy tasarım şablonu kullanılır. Her yöntem(algoritma) bir sınıf için implemente edilir. Yani meseleyi toplarsak, çalışma zamanında bir sınıfın davranışı veya algoritması bir stratejiye göre değiştirilebilir.

## Observer

Observer pattern, bir nesne kümesi arasındaki one-to-many ilişkiyi tanımlar. Yani bir nesnenin durumu değiştiğinde, bağımlı herkes bundan haberdar edilir.
Yapı Observer’lar(Gözlemciler) ve Subject(Özne) olarak kurulur. Gözlemci, gözledikleri nesnenin başına gelen herhangi bir olayı öğrenmek ister. Bu  yapı ile gözlenen nesne de herhangi bir değişiklik yapıldığında gözlemcilere bu durumun bildirilmesi sağlanır.Örnek verecek olursak yakınınızda bir mağaza var ve siz oraya yeni gelecek bir ürünü satın almak istiyorsunuz . Hergün mağazaya gidip ürün geldi mi diye kontrol ediyorsunuz . Bu size boşuna zaman kaybı yapıyor.  Buna çözüm olarak mağaza müşterilerinin bu durumunu göz önüne alarak bir  yapı tasarlıyor ve haberdar olmak isteyen müşteriler bu durumu belirttiği takdirde mağaza ilgili konu ile ilgili müşterileri haberdar edecek bir sistem tasarlıyorlar.

## Template Design Pattern

Tasarım şablonunda bir gidişat belirleyebilmek, bir algoritma yapabilmek adına işlemler soyut olarak tanımlanır. Bu işlemler, bir şablon metot tarafından çalıştırılır.Alt sınıflarda kendi bünyelerinde implemente ederek kulanılan algoritmanın istekleri doğrultusunda çalışmasını sağlayablirler.
Yani mesela biz bir dosyadan veri okuyacağız ve bu işlemi gerçekleştirilirken önce dosyayı açar, sonra bilgileri kontrol eder ve bize lazım olan kısımı alırız,bu işlemi yapacağımız her zaman bu işlem aynıdır, bundan dolayı bunu abstract class da bir metot yaparak şablon aracılığı ile kullanabiliriz.

## Prototype Pattern

Bu patterni şu şekilde düşünebiliriz. Elimizde bir nesne var ve biz bunu baz alarak yeni bir kopya yaratacaz yani prototipini çıkaracaz. Yani bir nesneyi klonlayarak yeni bir nesne üretmeye denir.
New operatörü kullanılmaz varolan nesne klonlanır. İlk nesne prototip ,yeni nesne ise klonumuzdur.

## Adapter Design Pattern

Adapter Design Pattern ile iki uyumsuz interface beraber kullanılabilir.Daha önce yazılmış olan kodları düzenlemek zorunda kalmayız. Çünkü bunların doğru çalıştığını kabul etmekteyiz. Daha önce eğer farklı bir yerde kullanıldıysa da bunları değişmemize gerek kalmaz adapte edilecek class üzerinde herhangi bir değişiklik yapılmamıştır. Ara bir katman ile ikisi arasında Adapte etme işlemi sağlanmıştır.

## Front Controller Pattern

Front Controller amacı gelen istekler merkezi bir yerde toplanır ve ilgili nokta neresi ise oraya yönlendirme yapılır. Yani özetliyecek olursak Client’ten bize bir request gelir bu FrontController katmanında kontrol edilir ve ilgili metoda yönlendirmesi yapılır.


