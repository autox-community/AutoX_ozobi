
package org.autojs.autoxjs.network.entity.topic;

import com.google.gson.annotations.SerializedName;

import org.autojs.autoxjs.network.entity.user.User;

import java.util.List;

@SuppressWarnings("unused")
public class Replies {

    @SerializedName("count")
    private long mCount;
    @SerializedName("hasMore")
    private boolean mHasMore;
    @SerializedName("text")
    private String mText;
    @SerializedName("users")
    private List<User> mUsers;

    public long getCount() {
        return mCount;
    }

    public void setCount(long count) {
        mCount = count;
    }

    public boolean getHasMore() {
        return mHasMore;
    }

    public void setHasMore(boolean hasMore) {
        mHasMore = hasMore;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public List<User> getUsers() {
        return mUsers;
    }

    public void setUsers(List<User> users) {
        mUsers = users;
    }

}
