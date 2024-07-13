using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LearningCSharp
{
    // A const is a compile-time constant whereas readonly allows a value to be calculated at
    // run-time and set in the constructor or field initializer.
    internal class ReadonlyVsConst
    {
        // const variables must be initialized at the field scope (in their declaration).
        const string s1 = "test";
        // readonly values can be initialized in the constructor.
        readonly string s2;

        internal ReadonlyVsConst(string s2)
        {
            this.s2 = s2;
        }
    }
}
