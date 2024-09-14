const { execSync } = require('child_process');
const path = require('path');
const fs = require('fs');


const file = process.argv[2] || 'Main.kt';


const kotlinFile = path.resolve('src/', file);
const jarFile = 'Main.jar';


const quotedKotlinFile = `"${kotlinFile}.kt"`;
const quotedJarFile = `"${jarFile}"`;

try {

  execSync(`kotlinc ${quotedKotlinFile} -include-runtime -d ${quotedJarFile}`, { stdio: 'inherit' });


  execSync(`java -jar ${quotedJarFile}`, { stdio: 'inherit' });
} catch (error) {
  console.error('An error occurred:', error.message);
} finally {

  if (fs.existsSync(jarFile)) {
    fs.unlinkSync(jarFile);
  }
}
