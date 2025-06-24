var Voting = artifacts.require("Voting");

module.exports = async function(deployer) {
  await deployer.deploy(Voting);  // Deploys a new instance of Voting
};
