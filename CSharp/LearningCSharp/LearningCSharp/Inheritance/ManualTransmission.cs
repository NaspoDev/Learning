using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LearningCSharp
{
    // Common practice for naming interfaces is to start the name with capital "I".
    internal interface IManualTransmission
    {
        public void ShiftDown();
        public void ShiftUp();
    }
}
