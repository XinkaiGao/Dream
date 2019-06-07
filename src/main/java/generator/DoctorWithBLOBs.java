package generator;

import java.io.Serializable;

/**
 * doctor
 * @author 
 */
public class DoctorWithBLOBs extends Doctor implements Serializable {
    /**
     * 自我描述
     */
    private String description;

    /**
     * 职业背景
     */
    private String profesBack;

    /**
     * 擅长
     */
    private String goodAt;

    /**
     * 咨询风格
     */
    private String consultStyle;

    /**
     * 受训背景
     */
    private String trainingBackground;

    private String freeTime;

    /**
     * 预约时间
     */
    private String newBookingTime;

    /**
     * 无人回复的咨询，每天推送给该咨询师的次数记录
     */
    private String pushMsgCount;

    /**
     * 对应app的专属介绍，如果没有则显示原有的介绍
     */
    private String recDesc;

    /**
     * 第一次私聊默认回复
     */
    private String firstDefaultReply;

    private static final long serialVersionUID = 1L;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfesBack() {
        return profesBack;
    }

    public void setProfesBack(String profesBack) {
        this.profesBack = profesBack;
    }

    public String getGoodAt() {
        return goodAt;
    }

    public void setGoodAt(String goodAt) {
        this.goodAt = goodAt;
    }

    public String getConsultStyle() {
        return consultStyle;
    }

    public void setConsultStyle(String consultStyle) {
        this.consultStyle = consultStyle;
    }

    public String getTrainingBackground() {
        return trainingBackground;
    }

    public void setTrainingBackground(String trainingBackground) {
        this.trainingBackground = trainingBackground;
    }

    public String getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(String freeTime) {
        this.freeTime = freeTime;
    }

    public String getNewBookingTime() {
        return newBookingTime;
    }

    public void setNewBookingTime(String newBookingTime) {
        this.newBookingTime = newBookingTime;
    }

    public String getPushMsgCount() {
        return pushMsgCount;
    }

    public void setPushMsgCount(String pushMsgCount) {
        this.pushMsgCount = pushMsgCount;
    }

    public String getRecDesc() {
        return recDesc;
    }

    public void setRecDesc(String recDesc) {
        this.recDesc = recDesc;
    }

    public String getFirstDefaultReply() {
        return firstDefaultReply;
    }

    public void setFirstDefaultReply(String firstDefaultReply) {
        this.firstDefaultReply = firstDefaultReply;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DoctorWithBLOBs other = (DoctorWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSmallImage() == null ? other.getSmallImage() == null : this.getSmallImage().equals(other.getSmallImage()))
            && (this.getHead() == null ? other.getHead() == null : this.getHead().equals(other.getHead()))
            && (this.getScene() == null ? other.getScene() == null : this.getScene().equals(other.getScene()))
            && (this.getBigImage() == null ? other.getBigImage() == null : this.getBigImage().equals(other.getBigImage()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getHospitalId() == null ? other.getHospitalId() == null : this.getHospitalId().equals(other.getHospitalId()))
            && (this.getHospitalName() == null ? other.getHospitalName() == null : this.getHospitalName().equals(other.getHospitalName()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getDepartmentName() == null ? other.getDepartmentName() == null : this.getDepartmentName().equals(other.getDepartmentName()))
            && (this.getRecommendIndex() == null ? other.getRecommendIndex() == null : this.getRecommendIndex().equals(other.getRecommendIndex()))
            && (this.getServiceIndex() == null ? other.getServiceIndex() == null : this.getServiceIndex().equals(other.getServiceIndex()))
            && (this.getPhysicLevel() == null ? other.getPhysicLevel() == null : this.getPhysicLevel().equals(other.getPhysicLevel()))
            && (this.getIsAllowConsult() == null ? other.getIsAllowConsult() == null : this.getIsAllowConsult().equals(other.getIsAllowConsult()))
            && (this.getIsShow() == null ? other.getIsShow() == null : this.getIsShow().equals(other.getIsShow()))
            && (this.getIsHot() == null ? other.getIsHot() == null : this.getIsHot().equals(other.getIsHot()))
            && (this.getReplyNum() == null ? other.getReplyNum() == null : this.getReplyNum().equals(other.getReplyNum()))
            && (this.getFansNum() == null ? other.getFansNum() == null : this.getFansNum().equals(other.getFansNum()))
            && (this.getTag1() == null ? other.getTag1() == null : this.getTag1().equals(other.getTag1()))
            && (this.getTag2() == null ? other.getTag2() == null : this.getTag2().equals(other.getTag2()))
            && (this.getTag3() == null ? other.getTag3() == null : this.getTag3().equals(other.getTag3()))
            && (this.getImageIdcard() == null ? other.getImageIdcard() == null : this.getImageIdcard().equals(other.getImageIdcard()))
            && (this.getImageIdcardThumb() == null ? other.getImageIdcardThumb() == null : this.getImageIdcardThumb().equals(other.getImageIdcardThumb()))
            && (this.getImageIdcardBig() == null ? other.getImageIdcardBig() == null : this.getImageIdcardBig().equals(other.getImageIdcardBig()))
            && (this.getImageIdcardr() == null ? other.getImageIdcardr() == null : this.getImageIdcardr().equals(other.getImageIdcardr()))
            && (this.getImageIdcardrThumb() == null ? other.getImageIdcardrThumb() == null : this.getImageIdcardrThumb().equals(other.getImageIdcardrThumb()))
            && (this.getImageIdcardrBig() == null ? other.getImageIdcardrBig() == null : this.getImageIdcardrBig().equals(other.getImageIdcardrBig()))
            && (this.getImageProfessNo() == null ? other.getImageProfessNo() == null : this.getImageProfessNo().equals(other.getImageProfessNo()))
            && (this.getImageProfess() == null ? other.getImageProfess() == null : this.getImageProfess().equals(other.getImageProfess()))
            && (this.getImageProfessThumb() == null ? other.getImageProfessThumb() == null : this.getImageProfessThumb().equals(other.getImageProfessThumb()))
            && (this.getImageProfessBig() == null ? other.getImageProfessBig() == null : this.getImageProfessBig().equals(other.getImageProfessBig()))
            && (this.getImageEdu() == null ? other.getImageEdu() == null : this.getImageEdu().equals(other.getImageEdu()))
            && (this.getImageEduThumb() == null ? other.getImageEduThumb() == null : this.getImageEduThumb().equals(other.getImageEduThumb()))
            && (this.getImageEduBig() == null ? other.getImageEduBig() == null : this.getImageEduBig().equals(other.getImageEduBig()))
            && (this.getImageMarital() == null ? other.getImageMarital() == null : this.getImageMarital().equals(other.getImageMarital()))
            && (this.getImageTotal() == null ? other.getImageTotal() == null : this.getImageTotal().equals(other.getImageTotal()))
            && (this.getImageTotalThumb() == null ? other.getImageTotalThumb() == null : this.getImageTotalThumb().equals(other.getImageTotalThumb()))
            && (this.getImageTotalBig() == null ? other.getImageTotalBig() == null : this.getImageTotalBig().equals(other.getImageTotalBig()))
            && (this.getImageTrain() == null ? other.getImageTrain() == null : this.getImageTrain().equals(other.getImageTrain()))
            && (this.getImageTrainThumb() == null ? other.getImageTrainThumb() == null : this.getImageTrainThumb().equals(other.getImageTrainThumb()))
            && (this.getImageTrainBig() == null ? other.getImageTrainBig() == null : this.getImageTrainBig().equals(other.getImageTrainBig()))
            && (this.getFeeStandard() == null ? other.getFeeStandard() == null : this.getFeeStandard().equals(other.getFeeStandard()))
            && (this.getIsAuth() == null ? other.getIsAuth() == null : this.getIsAuth().equals(other.getIsAuth()))
            && (this.getWecharNum() == null ? other.getWecharNum() == null : this.getWecharNum().equals(other.getWecharNum()))
            && (this.getEdu() == null ? other.getEdu() == null : this.getEdu().equals(other.getEdu()))
            && (this.getFamousRemark() == null ? other.getFamousRemark() == null : this.getFamousRemark().equals(other.getFamousRemark()))
            && (this.getAskTotalTime() == null ? other.getAskTotalTime() == null : this.getAskTotalTime().equals(other.getAskTotalTime()))
            && (this.getOrderNum() == null ? other.getOrderNum() == null : this.getOrderNum().equals(other.getOrderNum()))
            && (this.getIsTjIndex() == null ? other.getIsTjIndex() == null : this.getIsTjIndex().equals(other.getIsTjIndex()))
            && (this.getTjIndexReason() == null ? other.getTjIndexReason() == null : this.getTjIndexReason().equals(other.getTjIndexReason()))
            && (this.getIsSupervisor() == null ? other.getIsSupervisor() == null : this.getIsSupervisor().equals(other.getIsSupervisor()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsJoinListen() == null ? other.getIsJoinListen() == null : this.getIsJoinListen().equals(other.getIsJoinListen()))
            && (this.getOrderZan() == null ? other.getOrderZan() == null : this.getOrderZan().equals(other.getOrderZan()))
            && (this.getNohelpNum() == null ? other.getNohelpNum() == null : this.getNohelpNum().equals(other.getNohelpNum()))
            && (this.getOrderAns() == null ? other.getOrderAns() == null : this.getOrderAns().equals(other.getOrderAns()))
            && (this.getOrderAvaAnsTime() == null ? other.getOrderAvaAnsTime() == null : this.getOrderAvaAnsTime().equals(other.getOrderAvaAnsTime()))
            && (this.getWorkYears() == null ? other.getWorkYears() == null : this.getWorkYears().equals(other.getWorkYears()))
            && (this.getTempScene() == null ? other.getTempScene() == null : this.getTempScene().equals(other.getTempScene()))
            && (this.getLineDefaultContent() == null ? other.getLineDefaultContent() == null : this.getLineDefaultContent().equals(other.getLineDefaultContent()))
            && (this.getHomeAddress() == null ? other.getHomeAddress() == null : this.getHomeAddress().equals(other.getHomeAddress()))
            && (this.getConsultRoomType() == null ? other.getConsultRoomType() == null : this.getConsultRoomType().equals(other.getConsultRoomType()))
            && (this.getFaceConsultAddress() == null ? other.getFaceConsultAddress() == null : this.getFaceConsultAddress().equals(other.getFaceConsultAddress()))
            && (this.getSpecialPush() == null ? other.getSpecialPush() == null : this.getSpecialPush().equals(other.getSpecialPush()))
            && (this.getShowPosition() == null ? other.getShowPosition() == null : this.getShowPosition().equals(other.getShowPosition()))
            && (this.getYunClientId() == null ? other.getYunClientId() == null : this.getYunClientId().equals(other.getYunClientId()))
            && (this.getAgent() == null ? other.getAgent() == null : this.getAgent().equals(other.getAgent()))
            && (this.getFeeRate() == null ? other.getFeeRate() == null : this.getFeeRate().equals(other.getFeeRate()))
            && (this.getFeeRateWechat() == null ? other.getFeeRateWechat() == null : this.getFeeRateWechat().equals(other.getFeeRateWechat()))
            && (this.getOrganizeId() == null ? other.getOrganizeId() == null : this.getOrganizeId().equals(other.getOrganizeId()))
            && (this.getReferrer() == null ? other.getReferrer() == null : this.getReferrer().equals(other.getReferrer()))
            && (this.getIsTaobaoSunday() == null ? other.getIsTaobaoSunday() == null : this.getIsTaobaoSunday().equals(other.getIsTaobaoSunday()))
            && (this.getIsChatOnline() == null ? other.getIsChatOnline() == null : this.getIsChatOnline().equals(other.getIsChatOnline()))
            && (this.getSetOnlineTime() == null ? other.getSetOnlineTime() == null : this.getSetOnlineTime().equals(other.getSetOnlineTime()))
            && (this.getChatAutoReply() == null ? other.getChatAutoReply() == null : this.getChatAutoReply().equals(other.getChatAutoReply()))
            && (this.getJobCat() == null ? other.getJobCat() == null : this.getJobCat().equals(other.getJobCat()))
            && (this.getJobRemark() == null ? other.getJobRemark() == null : this.getJobRemark().equals(other.getJobRemark()))
            && (this.getRecApp() == null ? other.getRecApp() == null : this.getRecApp().equals(other.getRecApp()))
            && (this.getRecRemark() == null ? other.getRecRemark() == null : this.getRecRemark().equals(other.getRecRemark()))
            && (this.getGroup() == null ? other.getGroup() == null : this.getGroup().equals(other.getGroup()))
            && (this.getReplyViolate() == null ? other.getReplyViolate() == null : this.getReplyViolate().equals(other.getReplyViolate()))
            && (this.getPseudonym() == null ? other.getPseudonym() == null : this.getPseudonym().equals(other.getPseudonym()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getAbilityLevel() == null ? other.getAbilityLevel() == null : this.getAbilityLevel().equals(other.getAbilityLevel()))
            && (this.getBusinessLevel() == null ? other.getBusinessLevel() == null : this.getBusinessLevel().equals(other.getBusinessLevel()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getProfesBack() == null ? other.getProfesBack() == null : this.getProfesBack().equals(other.getProfesBack()))
            && (this.getGoodAt() == null ? other.getGoodAt() == null : this.getGoodAt().equals(other.getGoodAt()))
            && (this.getConsultStyle() == null ? other.getConsultStyle() == null : this.getConsultStyle().equals(other.getConsultStyle()))
            && (this.getTrainingBackground() == null ? other.getTrainingBackground() == null : this.getTrainingBackground().equals(other.getTrainingBackground()))
            && (this.getFreeTime() == null ? other.getFreeTime() == null : this.getFreeTime().equals(other.getFreeTime()))
            && (this.getNewBookingTime() == null ? other.getNewBookingTime() == null : this.getNewBookingTime().equals(other.getNewBookingTime()))
            && (this.getPushMsgCount() == null ? other.getPushMsgCount() == null : this.getPushMsgCount().equals(other.getPushMsgCount()))
            && (this.getRecDesc() == null ? other.getRecDesc() == null : this.getRecDesc().equals(other.getRecDesc()))
            && (this.getFirstDefaultReply() == null ? other.getFirstDefaultReply() == null : this.getFirstDefaultReply().equals(other.getFirstDefaultReply()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSmallImage() == null) ? 0 : getSmallImage().hashCode());
        result = prime * result + ((getHead() == null) ? 0 : getHead().hashCode());
        result = prime * result + ((getScene() == null) ? 0 : getScene().hashCode());
        result = prime * result + ((getBigImage() == null) ? 0 : getBigImage().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getHospitalId() == null) ? 0 : getHospitalId().hashCode());
        result = prime * result + ((getHospitalName() == null) ? 0 : getHospitalName().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getDepartmentName() == null) ? 0 : getDepartmentName().hashCode());
        result = prime * result + ((getRecommendIndex() == null) ? 0 : getRecommendIndex().hashCode());
        result = prime * result + ((getServiceIndex() == null) ? 0 : getServiceIndex().hashCode());
        result = prime * result + ((getPhysicLevel() == null) ? 0 : getPhysicLevel().hashCode());
        result = prime * result + ((getIsAllowConsult() == null) ? 0 : getIsAllowConsult().hashCode());
        result = prime * result + ((getIsShow() == null) ? 0 : getIsShow().hashCode());
        result = prime * result + ((getIsHot() == null) ? 0 : getIsHot().hashCode());
        result = prime * result + ((getReplyNum() == null) ? 0 : getReplyNum().hashCode());
        result = prime * result + ((getFansNum() == null) ? 0 : getFansNum().hashCode());
        result = prime * result + ((getTag1() == null) ? 0 : getTag1().hashCode());
        result = prime * result + ((getTag2() == null) ? 0 : getTag2().hashCode());
        result = prime * result + ((getTag3() == null) ? 0 : getTag3().hashCode());
        result = prime * result + ((getImageIdcard() == null) ? 0 : getImageIdcard().hashCode());
        result = prime * result + ((getImageIdcardThumb() == null) ? 0 : getImageIdcardThumb().hashCode());
        result = prime * result + ((getImageIdcardBig() == null) ? 0 : getImageIdcardBig().hashCode());
        result = prime * result + ((getImageIdcardr() == null) ? 0 : getImageIdcardr().hashCode());
        result = prime * result + ((getImageIdcardrThumb() == null) ? 0 : getImageIdcardrThumb().hashCode());
        result = prime * result + ((getImageIdcardrBig() == null) ? 0 : getImageIdcardrBig().hashCode());
        result = prime * result + ((getImageProfessNo() == null) ? 0 : getImageProfessNo().hashCode());
        result = prime * result + ((getImageProfess() == null) ? 0 : getImageProfess().hashCode());
        result = prime * result + ((getImageProfessThumb() == null) ? 0 : getImageProfessThumb().hashCode());
        result = prime * result + ((getImageProfessBig() == null) ? 0 : getImageProfessBig().hashCode());
        result = prime * result + ((getImageEdu() == null) ? 0 : getImageEdu().hashCode());
        result = prime * result + ((getImageEduThumb() == null) ? 0 : getImageEduThumb().hashCode());
        result = prime * result + ((getImageEduBig() == null) ? 0 : getImageEduBig().hashCode());
        result = prime * result + ((getImageMarital() == null) ? 0 : getImageMarital().hashCode());
        result = prime * result + ((getImageTotal() == null) ? 0 : getImageTotal().hashCode());
        result = prime * result + ((getImageTotalThumb() == null) ? 0 : getImageTotalThumb().hashCode());
        result = prime * result + ((getImageTotalBig() == null) ? 0 : getImageTotalBig().hashCode());
        result = prime * result + ((getImageTrain() == null) ? 0 : getImageTrain().hashCode());
        result = prime * result + ((getImageTrainThumb() == null) ? 0 : getImageTrainThumb().hashCode());
        result = prime * result + ((getImageTrainBig() == null) ? 0 : getImageTrainBig().hashCode());
        result = prime * result + ((getFeeStandard() == null) ? 0 : getFeeStandard().hashCode());
        result = prime * result + ((getIsAuth() == null) ? 0 : getIsAuth().hashCode());
        result = prime * result + ((getWecharNum() == null) ? 0 : getWecharNum().hashCode());
        result = prime * result + ((getEdu() == null) ? 0 : getEdu().hashCode());
        result = prime * result + ((getFamousRemark() == null) ? 0 : getFamousRemark().hashCode());
        result = prime * result + ((getAskTotalTime() == null) ? 0 : getAskTotalTime().hashCode());
        result = prime * result + ((getOrderNum() == null) ? 0 : getOrderNum().hashCode());
        result = prime * result + ((getIsTjIndex() == null) ? 0 : getIsTjIndex().hashCode());
        result = prime * result + ((getTjIndexReason() == null) ? 0 : getTjIndexReason().hashCode());
        result = prime * result + ((getIsSupervisor() == null) ? 0 : getIsSupervisor().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsJoinListen() == null) ? 0 : getIsJoinListen().hashCode());
        result = prime * result + ((getOrderZan() == null) ? 0 : getOrderZan().hashCode());
        result = prime * result + ((getNohelpNum() == null) ? 0 : getNohelpNum().hashCode());
        result = prime * result + ((getOrderAns() == null) ? 0 : getOrderAns().hashCode());
        result = prime * result + ((getOrderAvaAnsTime() == null) ? 0 : getOrderAvaAnsTime().hashCode());
        result = prime * result + ((getWorkYears() == null) ? 0 : getWorkYears().hashCode());
        result = prime * result + ((getTempScene() == null) ? 0 : getTempScene().hashCode());
        result = prime * result + ((getLineDefaultContent() == null) ? 0 : getLineDefaultContent().hashCode());
        result = prime * result + ((getHomeAddress() == null) ? 0 : getHomeAddress().hashCode());
        result = prime * result + ((getConsultRoomType() == null) ? 0 : getConsultRoomType().hashCode());
        result = prime * result + ((getFaceConsultAddress() == null) ? 0 : getFaceConsultAddress().hashCode());
        result = prime * result + ((getSpecialPush() == null) ? 0 : getSpecialPush().hashCode());
        result = prime * result + ((getShowPosition() == null) ? 0 : getShowPosition().hashCode());
        result = prime * result + ((getYunClientId() == null) ? 0 : getYunClientId().hashCode());
        result = prime * result + ((getAgent() == null) ? 0 : getAgent().hashCode());
        result = prime * result + ((getFeeRate() == null) ? 0 : getFeeRate().hashCode());
        result = prime * result + ((getFeeRateWechat() == null) ? 0 : getFeeRateWechat().hashCode());
        result = prime * result + ((getOrganizeId() == null) ? 0 : getOrganizeId().hashCode());
        result = prime * result + ((getReferrer() == null) ? 0 : getReferrer().hashCode());
        result = prime * result + ((getIsTaobaoSunday() == null) ? 0 : getIsTaobaoSunday().hashCode());
        result = prime * result + ((getIsChatOnline() == null) ? 0 : getIsChatOnline().hashCode());
        result = prime * result + ((getSetOnlineTime() == null) ? 0 : getSetOnlineTime().hashCode());
        result = prime * result + ((getChatAutoReply() == null) ? 0 : getChatAutoReply().hashCode());
        result = prime * result + ((getJobCat() == null) ? 0 : getJobCat().hashCode());
        result = prime * result + ((getJobRemark() == null) ? 0 : getJobRemark().hashCode());
        result = prime * result + ((getRecApp() == null) ? 0 : getRecApp().hashCode());
        result = prime * result + ((getRecRemark() == null) ? 0 : getRecRemark().hashCode());
        result = prime * result + ((getGroup() == null) ? 0 : getGroup().hashCode());
        result = prime * result + ((getReplyViolate() == null) ? 0 : getReplyViolate().hashCode());
        result = prime * result + ((getPseudonym() == null) ? 0 : getPseudonym().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getAbilityLevel() == null) ? 0 : getAbilityLevel().hashCode());
        result = prime * result + ((getBusinessLevel() == null) ? 0 : getBusinessLevel().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getProfesBack() == null) ? 0 : getProfesBack().hashCode());
        result = prime * result + ((getGoodAt() == null) ? 0 : getGoodAt().hashCode());
        result = prime * result + ((getConsultStyle() == null) ? 0 : getConsultStyle().hashCode());
        result = prime * result + ((getTrainingBackground() == null) ? 0 : getTrainingBackground().hashCode());
        result = prime * result + ((getFreeTime() == null) ? 0 : getFreeTime().hashCode());
        result = prime * result + ((getNewBookingTime() == null) ? 0 : getNewBookingTime().hashCode());
        result = prime * result + ((getPushMsgCount() == null) ? 0 : getPushMsgCount().hashCode());
        result = prime * result + ((getRecDesc() == null) ? 0 : getRecDesc().hashCode());
        result = prime * result + ((getFirstDefaultReply() == null) ? 0 : getFirstDefaultReply().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", description=").append(description);
        sb.append(", profesBack=").append(profesBack);
        sb.append(", goodAt=").append(goodAt);
        sb.append(", consultStyle=").append(consultStyle);
        sb.append(", trainingBackground=").append(trainingBackground);
        sb.append(", freeTime=").append(freeTime);
        sb.append(", newBookingTime=").append(newBookingTime);
        sb.append(", pushMsgCount=").append(pushMsgCount);
        sb.append(", recDesc=").append(recDesc);
        sb.append(", firstDefaultReply=").append(firstDefaultReply);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}