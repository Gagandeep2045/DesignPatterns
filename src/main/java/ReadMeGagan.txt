https://docs.google.com/document/d/1TRu0ZyhMFd9_7azvET79RzK0gqYovJ8lBr8RVh-_iTg/edit

Builder Design Patten

When we do @Builder over Computer class , we are able to do
Computer.builder() -> builder() is static method which returns instance of static nested class CompuerBuilder
Now instanceOfComputerBuilder.ram(ram).cpu(cpu).graphicCard(graphicCard) 
So all properties defined in Computer class must also be in ComputerBuilder class and
also chaining is possible bcoz ram(String) , cpu(String cpu) , graphicCard(String) returns instance of this i.e Computer Builder
Finally we invoke build() defined as instance method in Computer class method which returns instance of Computer

