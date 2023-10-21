package commands;

public class BotCommonCommands {
    @AppBotCommand(name = "привет", description = "when request hello", showInHelp = true)
    String hello(){
        return "Привет, дружище! Давно не виделись :)";
    }

    @AppBotCommand(name = "Привет", description = "when request hello", showInHelp = true)
    String Hello(){
        return "Привет, дружище! Давно не виделись :)";
    }

    @AppBotCommand(name = "пока", description = "when request bye", showInHelp = true)
    String bye(){
        return "Ты уже уходишь? Как жаль... Приходи снова!";
    }

    @AppBotCommand(name = "Пока", description = "when request bye", showInHelp = true)
    String Bye(){
        return "Ты уже уходишь? Как жаль... Приходи снова!";
    }

    @AppBotCommand(name = "помоги", description = "when request help", showInKeyboard = true)
    String help(){
        return "Вы воспользовались командой /help. В дальнейшем в данном разделе будут все доступные команды бота.";
    }

    @AppBotCommand(name = "Помоги", description = "when request help", showInKeyboard = true)
    String Help(){
        return "Вы воспользовались командой /help. В дальнейшем в данном разделе будут все доступные команды бота.";
    }
    @AppBotCommand(name = "синергия", description = "when request synergy", showInKeyboard = true)
    String synergy(){
        return "Синергией называют такой момент взаимодействия разрозненных объектов, в который их объединенные усилия дают больший или меньший эффект, чем простая математическая сумма этих усилий.";
    }

    @AppBotCommand(name = "Синергия", description = "when request synergy", showInKeyboard = true)
    String Synergy(){
        return "Синергией называют такой момент взаимодействия разрозненных объектов, в который их объединенные усилия дают больший или меньший эффект, чем простая математическая сумма этих усилий.";
    }
}
