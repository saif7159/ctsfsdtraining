export class UserData{
    constructor(public email:string,
                public password:string,
                public phone: number,
                public interest:string,
                public gender:string,
                public remember:boolean    
            )
    {}
}