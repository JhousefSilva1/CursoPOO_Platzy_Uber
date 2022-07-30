from Car import Car
if __name__ == "__main__":
    print("Hola Mundo")
    
    car = Car()
    car.license = "AMS123"
    car.driver = "Camila"
    print(vars(car))
    
    car2 = Car()
    car2.license = "SAD895"
    car2.driver = "Sonia"
    print(vars(car2))