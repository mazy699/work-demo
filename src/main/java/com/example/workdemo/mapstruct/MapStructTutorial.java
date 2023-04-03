package com.example.workdemo.mapstruct;

public class MapStructTutorial {
    public static void main(String[] args) {
        //given
        Car car = new Car("Morris", 5, CarType.SEDAN);

        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        //then
        if (carDto != null) {
            System.out.println("carDto!=null");
            if ("Morris".equals(carDto.getMake())) {
                System.out.println("Morris equals carDto.getMake()");
            }
            if (carDto.getSeatCount() == 5) {
                System.out.println("carDto.getSeatCount()==5");
            }
            if ("SEDAN".equals(carDto.getType())) {
                System.out.println("SEDAN equals carDto.getType()");
            }
        }
    }
}
