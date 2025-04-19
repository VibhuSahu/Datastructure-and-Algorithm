/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function(accounts) {
    max = 0;
   for (let customer of accounts) {
       let transactions = 0;
       for (let transaction of customer) {
           transactions = transactions + transaction;
       }
       if (max<transactions){
           max = transactions;
       }
   }
   return max;
};