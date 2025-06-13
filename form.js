function Form()
{
    return(
    <div>
        <form>
            <h2 align="center">Student Registration Form</h2>
            <fieldset> 
                <p>
        <p style="color:rgb(63, 37, 70);background-color:rgb(183, 204, 218);">
                <label for="">Firstname:</label>
                <input type="text"/><br/><br/>
                <label for="">Lastname:</label>
                <input type="text"/><br/><br/>
                <label>Date of Birth</label>
                <input type="date"/><br/><br/>
                <label>Email id<span style="color:rgb(221, 14, 14);"></span></label>
                <input type="email"name=""id=""/>
                <label>password:</label>
                <input type="password"name=""id=""placeholder="Enter Password"/><br/><br/>
                <label>mobile number:</label>
                <input type="number"name=""id=""/><br/><br/>
                <label>Gender:</label>
                 &nbsp;&nbsp;<label for="1">female</label>
                <input type="radio"name="h"id="1"/></p>
                <label for="1">male</label>
                <input type="radio"name="h"id="1"/>
                <label for="1">others</label>
                <input type="radio"name="h"id="1"/><br/><br/>
                <label>Fathername:</label>
                <input type="text"/><br/><br/>
                <label>Motherername:</label>
                <input type="text"/><br/><br/>
                <legend>Address:</legend>
                <textarea rows="3"cols="40"></textarea><br/><br/>
                <label>Pincode:</label>
                <input type="number"/><br/><br/>
                <label>SSC Marks:</label>
                <input type="percentage"/><br/><br/>
                <label>Inter Marks:</label>
                <input type="percentage"/><br/><br/>
                <button>
                    Submit
                </button>
                <button>
                    reset
                </button>
                </p>
            </fieldset>
        </form>
         <p style="background-color:rgb(152, 96, 173);"></p>
        </div>
    );
}
export default Form;
