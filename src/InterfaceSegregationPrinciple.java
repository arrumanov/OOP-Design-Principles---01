public class InterfaceSegregationPrinciple {

    public IGodObject GetGodObject() {
        return new GodObject();
    }

    interface IGodObject{
        void Fly();
        void Swim();
        void WalkOnWater();
        void Levitate();
        void CreateCreature();
        void MoveMountain();
    }

    public class GodObject implements IGodObject {

        @Override
        public void Fly() {

        }

        @Override
        public void Swim() {

        }

        @Override
        public void WalkOnWater() {

        }

        @Override
        public void Levitate() {

        }

        @Override
        public void CreateCreature() {

        }

        @Override
        public void MoveMountain() {

        }
    }
}
