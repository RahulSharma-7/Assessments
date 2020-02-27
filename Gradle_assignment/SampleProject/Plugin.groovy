
class CustomPluginDate implements Plugin<Project> {
    @Override
    void apply(Project target) {

        target.task('Date'){
            doLast {
                def date = new Date();

                println "Current Date is "+ date;
            }
        }
    }
}
apply plugin : CustomPluginDate
