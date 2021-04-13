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
		String token = System.getenv("TOKEN");
		List<GatewayIntent> intents = new ArrayList<GatewayIntent>();
		intents.add(GatewayIntent.GUILD_VOICE_STATES);
		intents.add(GatewayIntent.GUILD_MESSAGES);
		intents.add(GatewayIntent.DIRECT_MESSAGES);
		intents.add(GatewayIntent.GUILD_MEMBERS);
		intents.add(GatewayIntent.GUILD_PRESENCES);
		JDABuilder mBuilder = JDABuilder.create(token, intents);
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
			channel.sendMessage("그런기능 안추가했어요").queue();
		}
		if (msg.getContentRaw().equals("!나원태")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("아칼리, 비에고, 피오라, 베인").queue();
		}
		if (msg.getContentRaw().equals("!한슬기")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("룰루, 소라카, 나미, 조이, 세라핀, 이렐리아, 오른")
			.queue();
		}
		if (msg.getContentRaw().equals("!윤영섭")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("Master. 키아나. 랜덤픽")
			.queue();
		}
		if (msg.getContentRaw().equals("!도치임")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("도...치임??")
			.queue();
		}
		if (msg.getContentRaw().equals("!베바지")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("지고간다고? 막판하실분?")
			.queue();
		}
		if (msg.getContentRaw().equals("!김정욱")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("봇 제작자. 봇 오류나도 내탓아님").queue();
		}
		if (msg.getContentRaw().equals("!김종오")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("Grand Master . 루시안").queue();
		}
		if (msg.getContentRaw().equals("!안규원")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("탈론 장인. twtich 알로오에 많이시청해주세요. 탈론, 키아나").queue();
		}
		if (msg.getContentRaw().equals("!종오")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("김치는밥도둑").queue();
		}
		if (msg.getContentRaw().equals("!차승훈")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("케넨, 요네, 야스오, 이렐리아, 카시오페아, 루시안, 에코").queue();
		}
		if (msg.getContentRaw().equals("!김지혁")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("샤코, 다리우스, 말파이트, 칼리스타, 람머스, 나르, 코그모(칼바람)").queue();
		}
		if (msg.getContentRaw().equals("!양희권")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("말자하, 말파이트, 마오카이, 에코, 진, 노틸러스, 니코 밍...").queue();
		}
		if (msg.getContentRaw().equals("!나혜진")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("소라카, 브랜드, 오소리").queue();
		}
		if (msg.getContentRaw().equals("!이주연")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("야 철 코. ^0^").queue();
		}
		if (msg.getContentRaw().equals("!상은")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("데이터가 부족해요.").queue();
		}
		if (msg.getContentRaw().equals("!김태경")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("레오나, 다이애나, 가렌, 요네, 갈리오, 쉔").queue();
		}
		if (msg.getContentRaw().equals("!최종문")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("잭스, 아트록스, 레넥톤, 볼리베어, 렝가, 나서스, 빅토르, 모데카이저, 바루스(방관)").queue();
		}
		if (msg.getContentRaw().equals("!김태현")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("말파이트, 가렌, 이즈리얼, 트리스타나, 노틸러스, 문도박사").queue();
		}
		if (msg.getContentRaw().equals("!김서연")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("럭스, 제라스").queue();
		}
		if (msg.getContentRaw().equals("!유승호")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("시비르, 자야, 세나").queue();
		}
		if (msg.getContentRaw().equals("!이한빈")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("파이크, 바드, 아리, 스웨인").queue();
		}
		if (msg.getContentRaw().equals("!고규태")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("아.. 나 라인서기 싫은데...").queue();
		}
		if (msg.getContentRaw().equals("!조재관")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("조이, 세라핀").queue();
		}
		if (msg.getContentRaw().equals("!방제준")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("카직스, 에코, 헤카림, 릴리아").queue();
		}
		if (msg.getContentRaw().equals("!천지원")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("야스오").queue();
		}
		if (msg.getContentRaw().equals("!김기휘")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("아리, 신드라, 럼블, 제이스").queue();
		}
		if (msg.getContentRaw().equals("!김도현")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("카타리나, 리븐, 녹턴, 다리우스").queue();
		}
		if (msg.getContentRaw().equals("!차원철")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("제드, 엘리스, 루시안").queue();
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
					channel.sendMessage("1팀 top : " + nameList.get(0).toString() +"\n"
							+ "1팀 jug : " + nameList.get(1).toString() +"\n"
							+ "1팀 mid : " + nameList.get(2).toString() +"\n"
							+ "1팀 adc : " + nameList.get(3).toString() +"\n"
							+ "1팀 spt : " + nameList.get(4).toString() +"\n"
							+ "2팀 top : " + nameList.get(5).toString() +"\n"
							+ "2팀 jug : " + nameList.get(6).toString() +"\n"
							+ "2팀 mid : " + nameList.get(7).toString() +"\n"
							+ "2팀 adj : " + nameList.get(8).toString() +"\n"
							+ "2팀 spt : " + nameList.get(9).toString()).queue();
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
					channel.sendMessage("사람이 부족합니다. 팀만 나눌께요.").queue();
					Collections.shuffle(nameList);
					int tmpNum = nameList.size()/2;
					for(int i = 0 ; i < tmpNum ; i++) {
						channel.sendMessage("1팀 : " + nameList.get(i).toString()).queue();
					}
					for(int i = tmpNum ; i < nameList.size(); i++) {
						channel.sendMessage("2팀 : " + nameList.get(i).toString()).queue();
					}
				}
				else if(nameList.size() > 10) {
					channel.sendMessage("사람이 너무 많아서 10명까지만 채우고 나머지는 관전이에요.").queue();
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
					for (int i = 10 ; i < nameList.size() ; i++) {
						channel.sendMessage("관전 : " + nameList.get(i).toString()).queue();
					}
				}
			}
			else{
				MessageChannel channel = event.getChannel();
				channel.sendMessage("사람이 없는데요...?").queue();
			}
		}
	}
}