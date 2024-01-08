import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.user_id_for_username_get200_response import UserIdForUsernameGet200Response  # noqa: E501
from openapi_server.models.user_user_id_articles_get200_response import UserUserIdArticlesGet200Response  # noqa: E501
from openapi_server.models.user_user_id_followers_get200_response import UserUserIdFollowersGet200Response  # noqa: E501
from openapi_server.models.user_user_id_following_get200_response import UserUserIdFollowingGet200Response  # noqa: E501
from openapi_server.models.user_user_id_get200_response import UserUserIdGet200Response  # noqa: E501
from openapi_server.models.user_user_id_interests_get200_response import UserUserIdInterestsGet200Response  # noqa: E501
from openapi_server.models.user_user_id_lists_get200_response import UserUserIdListsGet200Response  # noqa: E501
from openapi_server.models.user_user_id_publications_get200_response import UserUserIdPublicationsGet200Response  # noqa: E501
from openapi_server import util


def user_id_for_username_get(username):  # noqa: E501
    """Get User ID

    Returns the unique &#x60;user_id&#x60; for the given &#x60;username&#x60;.  **Note:** You can find the &#x60;username&#x60; from the user&#39;s/author&#39;s profile page URL.  - **username**.medium.com - medium.com/@**username**  # noqa: E501

    :param username: It&#39;s a unique string chosen by every single Medium user.
    :type username: str

    :rtype: Union[UserIdForUsernameGet200Response, Tuple[UserIdForUsernameGet200Response, int], Tuple[UserIdForUsernameGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def user_user_id_articles_get(user_id):  # noqa: E501
    """Get User&#39;s Articles

    Returns the list of articles (&#x60;article_ids&#x60;) written by the user.  # noqa: E501

    :param user_id: Unique hash id assigned to every single Medium user.
    :type user_id: str

    :rtype: Union[UserUserIdArticlesGet200Response, Tuple[UserUserIdArticlesGet200Response, int], Tuple[UserUserIdArticlesGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def user_user_id_followers_get(user_id, count=None):  # noqa: E501
    """Get User Followers

    Returns the list of &#x60;user_ids&#x60; of the user&#39;s followers.  **Note:** The length of this followers&#39; list might be different from what you get in  the \&quot;Get User Info\&quot; Endpoint. It&#39;s because, this list doesn&#39;t include Medium Users who  left the platform. If you really need the exact followers&#39; count, use this endpoint to get the followers&#39;  list and take its length as the exact followers&#39; count  # noqa: E501

    :param user_id: Unique hash id assigned to every single Medium user.
    :type user_id: str
    :param count: To limit the number of results. (count &amp;lt; 1500)
    :type count: int

    :rtype: Union[UserUserIdFollowersGet200Response, Tuple[UserUserIdFollowersGet200Response, int], Tuple[UserUserIdFollowersGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def user_user_id_following_get(user_id, count=None):  # noqa: E501
    """Get User Following

    Returns the list of &#x60;user_ids&#x60; of the user&#39;s followings.  **Note:** Currently, this list does not contain the &#x60;publication_ids&#x60; of the publications that the user is following.  # noqa: E501

    :param user_id: Unique hash id assigned to every single Medium user.
    :type user_id: str
    :param count: To limit the number of results. (count &amp;lt; 1500)
    :type count: int

    :rtype: Union[UserUserIdFollowingGet200Response, Tuple[UserUserIdFollowingGet200Response, int], Tuple[UserUserIdFollowingGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def user_user_id_get(user_id):  # noqa: E501
    """Get User Info

    Returns user related information like *Full name, Bio, Followers count, Following count, Twitter username, Profile-image URL, User ID, etc...*   It takes &#x60;user_id&#x60; as the path parameter.  **Note:** If you don&#39;t know the &#x60;user_id&#x60;, then you can get it from the endpoint\\ &#39;/user/id_for/{&#x60;username&#x60;}&#39;.  # noqa: E501

    :param user_id: It&#39;s a unique hash id assigned to every single Medium user.
    :type user_id: str

    :rtype: Union[UserUserIdGet200Response, Tuple[UserUserIdGet200Response, int], Tuple[UserUserIdGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def user_user_id_interests_get(user_id):  # noqa: E501
    """Get User&#39;s Interests

    Returns a list of tags that the given user follows.  # noqa: E501

    :param user_id: Unique hash id assigned to every single Medium user.
    :type user_id: str

    :rtype: Union[UserUserIdInterestsGet200Response, Tuple[UserUserIdInterestsGet200Response, int], Tuple[UserUserIdInterestsGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def user_user_id_lists_get(user_id):  # noqa: E501
    """Get User&#39;s Lists

    Returns an array of &#x60;list_ids&#x60; created by the user.  **Note:** You can check whether the use has created lists or not beforehand. Check the  &#x60;has_list&#x60; attribute in the \&quot;Article Info\&quot; endpoint.  # noqa: E501

    :param user_id: Unique hash id assigned to every single Medium user.
    :type user_id: str

    :rtype: Union[UserUserIdListsGet200Response, Tuple[UserUserIdListsGet200Response, int], Tuple[UserUserIdListsGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def user_user_id_publications_get(user_id):  # noqa: E501
    """Get User&#39;s Publications

    Returns a list of &#x60;publication_ids&#x60; where the user is the editor and/or creator.  # noqa: E501

    :param user_id: Unique hash id assigned to every single Medium user.
    :type user_id: str

    :rtype: Union[UserUserIdPublicationsGet200Response, Tuple[UserUserIdPublicationsGet200Response, int], Tuple[UserUserIdPublicationsGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def user_user_id_top_articles_get(user_id):  # noqa: E501
    """Get User&#39;s Top Articles

    Returns a list of &#x60;article_ids&#x60; of the top 10 articles on the user&#39;s profile, for a given &#x60;user_id&#x60;.  # noqa: E501

    :param user_id: Unique hash id assigned to every single Medium user.
    :type user_id: str

    :rtype: Union[UserUserIdArticlesGet200Response, Tuple[UserUserIdArticlesGet200Response, int], Tuple[UserUserIdArticlesGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'
