import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.comment import Comment  # noqa: E501
from openapi_server.models.issue_comment_list_request_bean import IssueCommentListRequestBean  # noqa: E501
from openapi_server.models.page_bean_comment import PageBeanComment  # noqa: E501
from openapi_server.models.page_of_comments import PageOfComments  # noqa: E501
from openapi_server import util


def add_comment(issue_id_or_key, comment, expand=None):  # noqa: E501
    """Add comment

    Adds a comment to an issue.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Add comments* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue. # noqa: E501

    :param issue_id_or_key: The ID or key of the issue.
    :type issue_id_or_key: str
    :param comment: 
    :type comment: dict | bytes
    :param expand: Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts &#x60;renderedBody&#x60;, which returns the comment body rendered in HTML.
    :type expand: str

    :rtype: Union[Comment, Tuple[Comment, int], Tuple[Comment, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        comment = Comment.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_comment(issue_id_or_key, id):  # noqa: E501
    """Delete comment

    Deletes a comment.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Delete all comments*[ project permission](https://confluence.atlassian.com/x/yodKLg) to delete any comment or *Delete own comments* to delete comment created by the user,  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to. # noqa: E501

    :param issue_id_or_key: The ID or key of the issue.
    :type issue_id_or_key: str
    :param id: The ID of the comment.
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_comment(issue_id_or_key, id, expand=None):  # noqa: E501
    """Get comment

    Returns a comment.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to. # noqa: E501

    :param issue_id_or_key: The ID or key of the issue.
    :type issue_id_or_key: str
    :param id: The ID of the comment.
    :type id: str
    :param expand: Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts &#x60;renderedBody&#x60;, which returns the comment body rendered in HTML.
    :type expand: str

    :rtype: Union[Comment, Tuple[Comment, int], Tuple[Comment, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_comments(issue_id_or_key, start_at=None, max_results=None, order_by=None, expand=None):  # noqa: E501
    """Get comments

    Returns all comments for an issue.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Comments are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is role visibility is restricted to. # noqa: E501

    :param issue_id_or_key: The ID or key of the issue.
    :type issue_id_or_key: str
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param order_by: [Order](#ordering) the results by a field. Accepts *created* to sort comments by their created date.
    :type order_by: str
    :param expand: Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts &#x60;renderedBody&#x60;, which returns the comment body rendered in HTML.
    :type expand: str

    :rtype: Union[PageOfComments, Tuple[PageOfComments, int], Tuple[PageOfComments, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_comments_by_ids(issue_comment_list_request_bean, expand=None):  # noqa: E501
    """Get comments by IDs

    Returns a [paginated](#pagination) list of comments specified by a list of comment IDs.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Comments are returned where the user:   *  has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to. # noqa: E501

    :param issue_comment_list_request_bean: The list of comment IDs.
    :type issue_comment_list_request_bean: dict | bytes
    :param expand: Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;renderedBody&#x60; Returns the comment body rendered in HTML.  *  &#x60;properties&#x60; Returns the comment&#39;s properties.
    :type expand: str

    :rtype: Union[PageBeanComment, Tuple[PageBeanComment, int], Tuple[PageBeanComment, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_comment_list_request_bean = IssueCommentListRequestBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_comment(issue_id_or_key, id, comment, notify_users=None, override_editable_flag=None, expand=None):  # noqa: E501
    """Update comment

    Updates a comment.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all comments*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any comment or *Edit own comments* to update comment created by the user.  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to. # noqa: E501

    :param issue_id_or_key: The ID or key of the issue.
    :type issue_id_or_key: str
    :param id: The ID of the comment.
    :type id: str
    :param comment: 
    :type comment: dict | bytes
    :param notify_users: Whether users are notified when a comment is updated.
    :type notify_users: bool
    :param override_editable_flag: Whether screen security is overridden to enable uneditable fields to be edited. Available to Connect app users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
    :type override_editable_flag: bool
    :param expand: Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts &#x60;renderedBody&#x60;, which returns the comment body rendered in HTML.
    :type expand: str

    :rtype: Union[Comment, Tuple[Comment, int], Tuple[Comment, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        comment = Comment.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
