<?php

class Usuario {
    private int $id;
    private string $email;

    public function __construct(int $id, string $email){
        $this->id = $id;
        $this->email = $email;
    }
	public function getId(): int {return $this->id;}

	public function getEmail(): string {return $this->email;}

	public function setId(int $id): void {$this->id = $id;}

	public function setEmail(string $email): void {$this->email = $email;}

	
}