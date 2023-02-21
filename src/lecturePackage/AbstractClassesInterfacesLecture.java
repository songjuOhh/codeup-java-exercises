package lecturePackage;

public class AbstractClassesInterfacesLecture {


    /*
    * -- PRE-READING QUESTIONS

        * What is an abstract class?
        - a class that can serve as a superclass, but cannot be directly instantiated.
        *
        - Can use instance as well as static variables and constants.
        - Can define regular methods that contain code and abstract methods that don’t contain code.
        - Can define static methods.
        - Make use of the abstract and extends keywords.
        - Contain
            * instance and static variables.
            * instance and static constants.
            * instance and static methods.
            *
        - a more general class meant to be extended by other more specific subclasses extending from an abstract class is a "type of" relationship
        - very general blueprint


        * What is an interface?
        - a special case of an abstract class. An interface is an abstract class that follows these rules:
        *

        - A class can directly implement multiple interfaces.
        - Any object created from a class that implements an interface can be used wherever the interface is accepted.
        - Can be used in place of classes to decouple parts of our code from implementation details.
        - Make use of the implements and interface keywords.
        - Contain
            - abstract methods.
            - static constants.
            * all methods are public and abstract.
            * all properties are public static and final.
            * no static methods.
            *
        - an aspect of something that may be made a part of another class implementing an interfaces is a "can be" or "can do" relationship
        - allow us to group different classes  together


        * What can an abstract class do that an interface can’t?
        - An abstract class can inherit a class and multiple interfaces
        - An interface cannot declare constructors or destructors.
        - An abstract class can declare constructors and destructors. It can extend any number of interfaces.

        - interface is a contract, so it depends on an implementation to serve its purpose. An interface can never have a state, so it cannot use mutable instance variables. An interface can only use final variables.




        * What can an interface do that an abstract class can’t?
        -

        * Does the idea of a bicycle match more closely with an abstract class or interface?
        - Abstract

        * Does the idea of “repairable” (being able to repair something) match more closely with an abstract class or interface?
        - Interface
            - Interfaces are very useful for
            * decoupling code & implementing polymorphism.
            - We can see an example in the JDK, with the List interface:

        * What other related examples of abstract classes and interfaces come to mind?
        -

*
*
*
*
*
        * -- NOTES

        * We will harness the power of inheritance and polymorphsm further in this lesson using more abstraction.

        * Abstract Class - a more general class meant to be extended by other more specific subclasses

        * extending from an abstract class is a “type of” relationship

        * Interface - an aspect of something that may be made a part of another class

        * implementing an interface is a “can do” or “can be” relationship
        Building b = new Library();
        abstract ConstructedThing
        abstract class Building

        * Abstract class examples: Building
            Sub-abstract Classes:
                abstrct class PublicBuilding extends Building
                    class Library extends PublicBuilding
                    class CivicCenter extends PublicBuilding
                    class PoliceDepartment extends PublicBuilding
                    class FireHouse extends PublicBuilding
                PrivateBuilding
                    House
                    Tent
                    Shed
                    Theater
                    MobileHome
                abstract CommercialBuilding
                    class StorageShed
                    class Warehouse
                    class Factory
                    class BicycleRepairShop
                    class GroceryStore




        * Interface examples:
            ClimateControlled
                adjustHeating()
                adjustInsulation()
            Portable
                getCurrentLocation()
                setNewLocation()
                secureTransport()
                moveToNewLocation()
                setAllRecordsToNewLocation()
            Accessible
                getNewRequirements()
                inspect()
                adjustBathrooms()
                adjustWalkways()
                adjustDoors()
            Serviceable
                installElectricalWiring()
                installPlumbing()
                connectPower()
                disconnectPower()
                turnOnWater()
                turnOffWater()
                makeUtilityPayment()
            Sellable
                getCurrentOwner()
                getOwnerHistory()
                transferDeedOfOwnership()
                buyerBackgroundCheck()
                deriveFairMarketValue()
            Rentable
                getCurrentRenterInfo()
                getRentalHistory()
                addRentalRecord()
                generateRentalContract()
                setRentalRate()
                setListingRentalStatus()
            Maintainable
            Securable


        -- More “Real World” Scenerio

        class ServerRequests
          giveMePosts()
          createAPost()
          deleteAPost()

        Interface CRUDable {
          create()
          read()
          update()
          delete()
        }
        CRUDFactory {
          CRUDable c = new MySQLPostsDataAccessObject();
          CRUDable getPostsCrudableObject()
            return c;
        }
        abstract class DataAccessObject
          connect()
          executeTransaction()
          disconnect()
        class MySQLPostsDataAccessObject extends DataAccessObject implements CRUDable
        class MongoDBPostsDataAccessObject extends DataAccessObject implements CRUDable
        class MariaDBPostsDataAccessObject extends DataAccessObject implements CRUDable
    * */


    /*? Abstract Classes
    *
     */
}
