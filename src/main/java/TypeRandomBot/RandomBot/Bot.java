package TypeRandomBot.RandomBot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;

public class Bot extends ListenerAdapter {

	public static String getUserName(Member member) {
		String userName = member.getNickname();
		if (userName == null) {
			userName = member.getUser().getName();
		}

		return userName;
	}
	
	public static void main(String[] args) throws LoginException {
		if (args.length < 1) {
			System.out.println("You have to provide a token as first argument!");
			System.exit(1);
		}
		// args[0] should be the token
		// We only need 2 intents in this bot. We only respond to messages in guilds and
		// private channels.
		// All other events will be disabled.
		// JDABuilder.create(args[0], GatewayIntent.GUILD_MESSAGES,
		// GatewayIntent.DIRECT_MESSAGES, GatewayIntent.GUILD_MEMBERS,
		// GatewayIntent.GUILD_PRESENCES)
		// .addEventListeners(new Bot())
		// .build();
		List<GatewayIntent> intents = new ArrayList<GatewayIntent>();
		intents.add(GatewayIntent.GUILD_VOICE_STATES);
		intents.add(GatewayIntent.GUILD_MESSAGES);
		intents.add(GatewayIntent.DIRECT_MESSAGES);
		intents.add(GatewayIntent.GUILD_MEMBERS);
		intents.add(GatewayIntent.GUILD_PRESENCES);
		JDABuilder mBuilder = JDABuilder.create(args[0], intents);
		mBuilder.setChunkingFilter(ChunkingFilter.ALL);
		mBuilder.setMemberCachePolicy(MemberCachePolicy.ALL);
		mBuilder.addEventListeners(new Bot());
		mBuilder.build();
	}

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		Message msg = event.getMessage();
		Member owner = event.getMember();
		if (msg.getContentRaw().equals("!ping")) {
			MessageChannel channel = event.getChannel();
			long time = System.currentTimeMillis();
			channel.sendMessage("Pong!") /* => RestAction<Message> */
			.queue();
		}
		if (msg.getContentRaw().equals("!사다리")) {
			Optional<List<Member>> optional = event.getGuild().getVoiceChannels().stream().filter(
					channel -> channel.getMembers().stream().anyMatch(member -> member.getId().equals(owner.getId())))
					.findFirst().map(channel -> channel.getMembers());

			if (optional.isPresent()) {
				MessageChannel channel = event.getChannel();
				long time = System.currentTimeMillis();
				List<Member> members = optional.get();
				List<String> nameList = members.stream().map(Bot::getUserName).collect(Collectors.toList());
				if(nameList.size() == 10) {
					Collections.shuffle(nameList);
					channel.sendMessage("1팀 top : " + nameList.get(0).toString()).queue();
					channel.sendMessage("1팀 jug : " + nameList.get(1).toString()).queue();
					channel.sendMessage("1팀 mid : " + nameList.get(2).toString()).queue();
					channel.sendMessage("1팀 adc : " + nameList.get(3).toString()).queue();
					channel.sendMessage("1팀 spt : " + nameList.get(4).toString()).queue();
					channel.sendMessage("2팀 top : " + nameList.get(5).toString()).queue();
					channel.sendMessage("2팀 jug : " + nameList.get(6).toString()).queue();
					channel.sendMessage("2팀 mid : " + nameList.get(7).toString()).queue();
					channel.sendMessage("2팀 adc : " + nameList.get(8).toString()).queue();
					channel.sendMessage("2팀 spt : " + nameList.get(9).toString()).queue();
				}
				else if(nameList.size() == 9) {
					nameList.add("지각생");
					Collections.shuffle(nameList);
					channel.sendMessage("1팀 top : " + nameList.get(0).toString()).queue();
					channel.sendMessage("1팀 jug : " + nameList.get(1).toString()).queue();
					channel.sendMessage("1팀 mid : " + nameList.get(2).toString()).queue();
					channel.sendMessage("1팀 adc : " + nameList.get(3).toString()).queue();
					channel.sendMessage("1팀 spt : " + nameList.get(4).toString()).queue();
					channel.sendMessage("2팀 top : " + nameList.get(5).toString()).queue();
					channel.sendMessage("2팀 jug : " + nameList.get(6).toString()).queue();
					channel.sendMessage("2팀 mid : " + nameList.get(7).toString()).queue();
					channel.sendMessage("2팀 adc : " + nameList.get(8).toString()).queue();
					channel.sendMessage("2팀 spt : " + nameList.get(9).toString()).queue();
					for(int i = 0 ; i < 10 ; i++) {
						if(nameList.get(i).toString() == "지각생") {
							nameList.remove(i);
						}
					}
				}
				else if(nameList.size() < 9) {
					channel.sendMessage("사람이 부족합니다.").queue();
				}
				else if(nameList.size() > 10) {
					channel.sendMessage("사람이 너무 많습니다. 노래봇 꺼주세요").queue();
				}
			}
		}

	}
}