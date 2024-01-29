<?php
class Person {
    public const SPECIES = "Homo Sapiens";
    public string $name;
    public int $age;
    public string $occupation;

    public function __construct(string $name, int $age, string $occupation){
        $this->name = $name;
        $this->age = $age;
        $this->occupation = $occupation;
    }
	
    public function introduce(){
        echo "Hello, my name is $this->name";
    }

    public function describe_job(){
        echo "I am currently working as a(n) $this->occupation";
    }

    public static function greet_extraterrestrials($especie){
        echo "Welcome to Planet Earth SPECIES_NAME_HERE! $especie" ;
    }
}
