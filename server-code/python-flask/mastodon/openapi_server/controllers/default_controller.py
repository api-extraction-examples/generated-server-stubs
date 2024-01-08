import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.account import Account  # noqa: E501
from openapi_server.models.activity import Activity  # noqa: E501
from openapi_server.models.admin_account import AdminAccount  # noqa: E501
from openapi_server.models.admin_report import AdminReport  # noqa: E501
from openapi_server.models.announcement import Announcement  # noqa: E501
from openapi_server.models.api_v1_admin_accounts_id_action_post_request import ApiV1AdminAccountsIdActionPostRequest  # noqa: E501
from openapi_server.models.api_v1_domain_blocks_post_request import ApiV1DomainBlocksPostRequest  # noqa: E501
from openapi_server.models.api_v1_featured_tags_post_request import ApiV1FeaturedTagsPostRequest  # noqa: E501
from openapi_server.models.api_v1_filters_post_request import ApiV1FiltersPostRequest  # noqa: E501
from openapi_server.models.api_v1_lists_id_accounts_post_request import ApiV1ListsIdAccountsPostRequest  # noqa: E501
from openapi_server.models.api_v1_lists_post_request import ApiV1ListsPostRequest  # noqa: E501
from openapi_server.models.api_v1_lists_put_request import ApiV1ListsPutRequest  # noqa: E501
from openapi_server.models.api_v1_media_post_request import ApiV1MediaPostRequest  # noqa: E501
from openapi_server.models.api_v1_polls_id_post_request import ApiV1PollsIdPostRequest  # noqa: E501
from openapi_server.models.api_v1_push_subscription_post_request import ApiV1PushSubscriptionPostRequest  # noqa: E501
from openapi_server.models.api_v1_push_subscription_put_request import ApiV1PushSubscriptionPutRequest  # noqa: E501
from openapi_server.models.api_v1_reports_post_request import ApiV1ReportsPostRequest  # noqa: E501
from openapi_server.models.api_v1_scheduled_statuses_id_put_request import ApiV1ScheduledStatusesIdPutRequest  # noqa: E501
from openapi_server.models.api_v1_statuses_id_reblog_post_request import ApiV1StatusesIdReblogPostRequest  # noqa: E501
from openapi_server.models.api_v1_statuses_post200_response import ApiV1StatusesPost200Response  # noqa: E501
from openapi_server.models.api_v1_statuses_post_request_inner import ApiV1StatusesPostRequestInner  # noqa: E501
from openapi_server.models.api_v2_search_get200_response import ApiV2SearchGet200Response  # noqa: E501
from openapi_server.models.attachment import Attachment  # noqa: E501
from openapi_server.models.card import Card  # noqa: E501
from openapi_server.models.context import Context  # noqa: E501
from openapi_server.models.conversation import Conversation  # noqa: E501
from openapi_server.models.emoji import Emoji  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.featured_tag import FeaturedTag  # noqa: E501
from openapi_server.models.filter import Filter  # noqa: E501
from openapi_server.models.identity_proof import IdentityProof  # noqa: E501
from openapi_server.models.instance import Instance  # noqa: E501
from openapi_server.models.notification import Notification  # noqa: E501
from openapi_server.models.poll import Poll  # noqa: E501
from openapi_server.models.preferences import Preferences  # noqa: E501
from openapi_server.models.push_subscription import PushSubscription  # noqa: E501
from openapi_server.models.relationship import Relationship  # noqa: E501
from openapi_server.models.report import Report  # noqa: E501
from openapi_server.models.scheduled_status import ScheduledStatus  # noqa: E501
from openapi_server.models.status import Status  # noqa: E501
from openapi_server.models.tag import Tag  # noqa: E501
from openapi_server import util


def api_oembed_get(url=None, maxwidth=None, maxheight=None):  # noqa: E501
    """api_oembed_get

    OEmbed as JSON # noqa: E501

    :param url: URL of a status
    :type url: str
    :param maxwidth: width of the iframe. Defaults to 400
    :type maxwidth: int
    :param maxheight: height of the iframe. Defaults to null
    :type maxheight: int

    :rtype: Union[Card, Tuple[Card, int], Tuple[Card, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_proofs_get(provider=None, username=None):  # noqa: E501
    """api_proofs_get

    View identity proof # noqa: E501

    :param provider: The identity provider to be looked up. Currently only supports keybase (case-sensitive)
    :type provider: str
    :param username: The username on the selected identity provider
    :type username: str

    :rtype: Union[IdentityProof, Tuple[IdentityProof, int], Tuple[IdentityProof, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_admin_accounts_get(local=None, remote=None, by_domain=None, active=None, pending=None, disabled=None, silenced=None, suspended=None, staff=None, username=None, display_name=None, email=None, ip=None):  # noqa: E501
    """api_v1_admin_accounts_get

    View accounts matching certain criteria for filtering, up to 100 at a time. Pagination may be done with the HTTP Link header in the response. # noqa: E501

    :param local: Filter for local accounts?
    :type local: bool
    :param remote: Filter for remote accounts?
    :type remote: bool
    :param by_domain: Filter by the given domain
    :type by_domain: str
    :param active: Filter for currently active accounts?
    :type active: bool
    :param pending: Filter for currently pending accounts?
    :type pending: bool
    :param disabled: Filter for currently disabled accounts?
    :type disabled: bool
    :param silenced: Filter for currently silenced accounts?
    :type silenced: bool
    :param suspended: Filter for currently suspended accounts?
    :type suspended: bool
    :param staff: Filter for staff accounts?
    :type staff: bool
    :param username: Username to search for
    :type username: str
    :param display_name: Display name to search for
    :type display_name: str
    :param email: Lookup a user with this email
    :type email: str
    :param ip: Lookup a user with this IP
    :type ip: str

    :rtype: Union[List[AdminAccount], Tuple[List[AdminAccount], int], Tuple[List[AdminAccount], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_admin_accounts_id_action_post(id, api_v1_admin_accounts_id_action_post_request=None):  # noqa: E501
    """api_v1_admin_accounts_id_action_post

    Perform an action against an account and log this action in the moderation history. # noqa: E501

    :param id: ID of the account
    :type id: str
    :param api_v1_admin_accounts_id_action_post_request: 
    :type api_v1_admin_accounts_id_action_post_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_admin_accounts_id_action_post_request = ApiV1AdminAccountsIdActionPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_admin_accounts_id_approve_post(id):  # noqa: E501
    """api_v1_admin_accounts_id_approve_post

    Approve the given local account if it is currently pending approval. # noqa: E501

    :param id: ID of the account
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_admin_accounts_id_enable_post(id):  # noqa: E501
    """api_v1_admin_accounts_id_enable_post

    Re-enable a local account whose login is currently disabled. # noqa: E501

    :param id: ID of the account
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_admin_accounts_id_get(id):  # noqa: E501
    """api_v1_admin_accounts_id_get

    View admin-level information about the given account. # noqa: E501

    :param id: ID of the account
    :type id: str

    :rtype: Union[AdminAccount, Tuple[AdminAccount, int], Tuple[AdminAccount, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_admin_accounts_id_reject_post(id):  # noqa: E501
    """api_v1_admin_accounts_id_reject_post

    Reject the given local account if it is currently pending approval. # noqa: E501

    :param id: ID of the account
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_admin_accounts_id_unsilence_post(id):  # noqa: E501
    """api_v1_admin_accounts_id_unsilence_post

    Unsilence a currently silenced account. # noqa: E501

    :param id: ID of the account
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_admin_accounts_id_unsuspend_post(id):  # noqa: E501
    """api_v1_admin_accounts_id_unsuspend_post

    Unsuspend a currently suspended account. # noqa: E501

    :param id: ID of the account
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_admin_reports_get(resolved=None, account_id=None, target_account_id=None):  # noqa: E501
    """api_v1_admin_reports_get

    View all reports. Pagination may be done with HTTP Link header in the response. # noqa: E501

    :param resolved: 
    :type resolved: bool
    :param account_id: 
    :type account_id: str
    :param target_account_id: 
    :type target_account_id: str

    :rtype: Union[List[AdminReport], Tuple[List[AdminReport], int], Tuple[List[AdminReport], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_admin_reports_id_assign_to_self_post(id):  # noqa: E501
    """api_v1_admin_reports_id_assign_to_self_post

    Claim the handling of this report to yourself. # noqa: E501

    :param id: ID of the report
    :type id: str

    :rtype: Union[AdminReport, Tuple[AdminReport, int], Tuple[AdminReport, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_admin_reports_id_get(id):  # noqa: E501
    """api_v1_admin_reports_id_get

    View information about the report with the given ID. # noqa: E501

    :param id: ID of the report
    :type id: str

    :rtype: Union[AdminReport, Tuple[AdminReport, int], Tuple[AdminReport, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_admin_reports_id_reopen_post(id):  # noqa: E501
    """api_v1_admin_reports_id_reopen_post

    Mark a report as resolved with no further action taken. # noqa: E501

    :param id: ID of the report
    :type id: str

    :rtype: Union[AdminReport, Tuple[AdminReport, int], Tuple[AdminReport, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_admin_reports_id_resolve_post(id):  # noqa: E501
    """api_v1_admin_reports_id_resolve_post

    Mark a report as resolved with no further action taken. # noqa: E501

    :param id: ID of the report
    :type id: str

    :rtype: Union[AdminReport, Tuple[AdminReport, int], Tuple[AdminReport, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_admin_reports_id_unassign_post(id):  # noqa: E501
    """api_v1_admin_reports_id_unassign_post

    Unassign a report so that someone else can claim it. # noqa: E501

    :param id: ID of the report
    :type id: str

    :rtype: Union[AdminReport, Tuple[AdminReport, int], Tuple[AdminReport, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_announcements_get(with_dismissed=None):  # noqa: E501
    """api_v1_announcements_get

    See all currently active announcements set by admins. # noqa: E501

    :param with_dismissed: If true, response will include announcements dismissed by the user. Defaults to false.
    :type with_dismissed: bool

    :rtype: Union[List[Announcement], Tuple[List[Announcement], int], Tuple[List[Announcement], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_announcements_id_dismiss_post(id):  # noqa: E501
    """api_v1_announcements_id_dismiss_post

    Allows a user to mark the announcement as read. # noqa: E501

    :param id: Local ID of an announcement in the database.
    :type id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_announcements_id_reactions_name_delete(id, name):  # noqa: E501
    """api_v1_announcements_id_reactions_name_delete

    Undo a react emoji to an announcement. # noqa: E501

    :param id: Local ID of an announcement in the database.
    :type id: str
    :param name: Unicode emoji, or shortcode of custom emoji
    :type name: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_announcements_id_reactions_name_put(id, name):  # noqa: E501
    """api_v1_announcements_id_reactions_name_put

    Allows a user to mark the announcement as read. # noqa: E501

    :param id: Local ID of an announcement in the database.
    :type id: str
    :param name: Unicode emoji, or shortcode of custom emoji
    :type name: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_blocks_get(limit=None, max_id=None, since_id=None):  # noqa: E501
    """api_v1_blocks_get

    Get blocked users. # noqa: E501

    :param limit: 
    :type limit: int
    :param max_id: 
    :type max_id: str
    :param since_id: 
    :type since_id: str

    :rtype: Union[List[Account], Tuple[List[Account], int], Tuple[List[Account], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_bookmarks_get(limit=None, max_id=None, since_id=None, min_id=None):  # noqa: E501
    """api_v1_bookmarks_get

    Statuses the user has bookmarked. # noqa: E501

    :param limit: 
    :type limit: int
    :param max_id: 
    :type max_id: str
    :param since_id: 
    :type since_id: str
    :param min_id: 
    :type min_id: str

    :rtype: Union[List[Status], Tuple[List[Status], int], Tuple[List[Status], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_conversations_get(limit=None, max_id=None, since_id=None, min_id=None):  # noqa: E501
    """api_v1_conversations_get

    Show conversation. # noqa: E501

    :param limit: Max number of results to return. Defaults to 20.
    :type limit: int
    :param max_id: Return results older than ID
    :type max_id: str
    :param since_id: Return results newer than ID
    :type since_id: str
    :param min_id: Return results immediately newer than ID
    :type min_id: str

    :rtype: Union[List[Conversation], Tuple[List[Conversation], int], Tuple[List[Conversation], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_conversations_id_delete(id):  # noqa: E501
    """api_v1_conversations_id_delete

    Remove converstation # noqa: E501

    :param id: ID of the conversation in the database
    :type id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_conversations_id_read_post(id):  # noqa: E501
    """api_v1_conversations_id_read_post

    Remove converstation # noqa: E501

    :param id: ID of the conversation in the database
    :type id: str

    :rtype: Union[Conversation, Tuple[Conversation, int], Tuple[Conversation, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_custom_emojis_get():  # noqa: E501
    """api_v1_custom_emojis_get

    Returns custom emojis that are available on the server. # noqa: E501


    :rtype: Union[List[Emoji], Tuple[List[Emoji], int], Tuple[List[Emoji], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_directory_get(limit=None, offset=None, order=None, local=None):  # noqa: E501
    """api_v1_directory_get

    List accounts visible in the directory. # noqa: E501

    :param limit: How many accounts to load. Default 40.
    :type limit: int
    :param offset: How many accounts to skip before returning results. Default 0.
    :type offset: int
    :param order: the &#x60;active&#x60; to sort by most recently posted statuses (default) or &#x60;new&#x60; to sort by most recently created profiles.
    :type order: str
    :param local: Only return local accounts.
    :type local: bool

    :rtype: Union[List[Account], Tuple[List[Account], int], Tuple[List[Account], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_domain_blocks_delete(domain):  # noqa: E501
    """api_v1_domain_blocks_delete

    Remove a domain block, if it exists in the user&#39;s array of blocked domains. # noqa: E501

    :param domain: Domain to unblock.
    :type domain: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_domain_blocks_get(limit=None, max_id=None, since_id=None):  # noqa: E501
    """api_v1_domain_blocks_get

    View domains the user has blocked. # noqa: E501

    :param limit: 
    :type limit: int
    :param max_id: 
    :type max_id: str
    :param since_id: 
    :type since_id: str

    :rtype: Union[List[str], Tuple[List[str], int], Tuple[List[str], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_domain_blocks_post(api_v1_domain_blocks_post_request=None):  # noqa: E501
    """api_v1_domain_blocks_post

    \&quot;Block a domain to: - hide all public posts from it - hide all notifications from it - remove all followers from it - prevent following new users from it (but does not remove existing follows)\&quot;  # noqa: E501

    :param api_v1_domain_blocks_post_request: 
    :type api_v1_domain_blocks_post_request: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_domain_blocks_post_request = ApiV1DomainBlocksPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_endorsements_get(limit=None, max_id=None, since_id=None):  # noqa: E501
    """api_v1_endorsements_get

    Accounts that the user is currently featuring on their profile. # noqa: E501

    :param limit: Maximum number of results to return. Defaults to 40. Paginate using the HTTP Link header.
    :type limit: int
    :param max_id: Internal parameter. Use HTTP Link header from response for pagination
    :type max_id: str
    :param since_id: Internal parameter. Use HTTP Link header from response for pagination.
    :type since_id: str

    :rtype: Union[List[Account], Tuple[List[Account], int], Tuple[List[Account], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_favourites_get(limit=None, max_id=None, min_id=None):  # noqa: E501
    """api_v1_favourites_get

    Statuses the user has favourited. # noqa: E501

    :param limit: 
    :type limit: str
    :param max_id: 
    :type max_id: str
    :param min_id: 
    :type min_id: str

    :rtype: Union[List[Status], Tuple[List[Status], int], Tuple[List[Status], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_featured_tags_get():  # noqa: E501
    """api_v1_featured_tags_get

    View your featured tags. # noqa: E501


    :rtype: Union[List[FeaturedTag], Tuple[List[FeaturedTag], int], Tuple[List[FeaturedTag], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_featured_tags_id_delete(id):  # noqa: E501
    """api_v1_featured_tags_id_delete

    Unfeature a tag # noqa: E501

    :param id: The id of the FeaturedTag to be unfeatured.
    :type id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_featured_tags_post(api_v1_featured_tags_post_request=None):  # noqa: E501
    """api_v1_featured_tags_post

    Create a feature a tag. # noqa: E501

    :param api_v1_featured_tags_post_request: 
    :type api_v1_featured_tags_post_request: dict | bytes

    :rtype: Union[FeaturedTag, Tuple[FeaturedTag, int], Tuple[FeaturedTag, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_featured_tags_post_request = ApiV1FeaturedTagsPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_featured_tags_suggestions_get():  # noqa: E501
    """api_v1_featured_tags_suggestions_get

    Shows your 10 most-used tags, with usage history for the past week. # noqa: E501


    :rtype: Union[List[FeaturedTag], Tuple[List[FeaturedTag], int], Tuple[List[FeaturedTag], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_filters_get():  # noqa: E501
    """api_v1_filters_get

     # noqa: E501


    :rtype: Union[List[Filter], Tuple[List[Filter], int], Tuple[List[Filter], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_filters_id_delete(id):  # noqa: E501
    """api_v1_filters_id_delete

    Delete a filter. # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_filters_id_get(id):  # noqa: E501
    """api_v1_filters_id_get

    Get one filter. # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[Filter, Tuple[Filter, int], Tuple[Filter, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_filters_id_put(id, api_v1_filters_post_request=None):  # noqa: E501
    """api_v1_filters_id_put

    Update a filter. # noqa: E501

    :param id: The id of the account in the database
    :type id: str
    :param api_v1_filters_post_request: 
    :type api_v1_filters_post_request: dict | bytes

    :rtype: Union[Filter, Tuple[Filter, int], Tuple[Filter, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_filters_post_request = ApiV1FiltersPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_filters_post(api_v1_filters_post_request=None):  # noqa: E501
    """api_v1_filters_post

     # noqa: E501

    :param api_v1_filters_post_request: 
    :type api_v1_filters_post_request: dict | bytes

    :rtype: Union[Filter, Tuple[Filter, int], Tuple[Filter, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_filters_post_request = ApiV1FiltersPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_follow_requests_get(limit=None):  # noqa: E501
    """api_v1_follow_requests_get

    Pending Follows # noqa: E501

    :param limit: Maximum number of results to return. Defaults to 40. Paginate using the HTTP Link header.
    :type limit: int

    :rtype: Union[List[Account], Tuple[List[Account], int], Tuple[List[Account], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_follow_requests_id_authorize_post(id):  # noqa: E501
    """api_v1_follow_requests_id_authorize_post

    Accept Follow # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[Relationship, Tuple[Relationship, int], Tuple[Relationship, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_follow_requests_id_reject_post(id):  # noqa: E501
    """api_v1_follow_requests_id_reject_post

    Accept Follow # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[Relationship, Tuple[Relationship, int], Tuple[Relationship, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_instance_activity_get():  # noqa: E501
    """api_v1_instance_activity_get

    Instance activity over the last 3 months, binned weekly. # noqa: E501


    :rtype: Union[List[Activity], Tuple[List[Activity], int], Tuple[List[Activity], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_instance_get():  # noqa: E501
    """api_v1_instance_get

    Information about the server. # noqa: E501


    :rtype: Union[Instance, Tuple[Instance, int], Tuple[Instance, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_instance_peers_get():  # noqa: E501
    """api_v1_instance_peers_get

    Information about the server. # noqa: E501


    :rtype: Union[List[str], Tuple[List[str], int], Tuple[List[str], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_lists_delete():  # noqa: E501
    """api_v1_lists_delete

    Delete a list # noqa: E501


    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_lists_get():  # noqa: E501
    """api_v1_lists_get

    Fetch all lists that the user owns. # noqa: E501


    :rtype: Union[List[List], Tuple[List[List], int], Tuple[List[List], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_lists_id_accounts_delete(id, account_ids):  # noqa: E501
    """api_v1_lists_id_accounts_delete

    Remove accounts from the given list. # noqa: E501

    :param id: ID of the list in the database
    :type id: str
    :param account_ids: Array of account IDs to add to the list.
    :type account_ids: List[str]

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_lists_id_accounts_get(id, limit=None, max_id=None, since_id=None):  # noqa: E501
    """api_v1_lists_id_accounts_get

    View accounts in List # noqa: E501

    :param id: ID of the list in the database
    :type id: str
    :param limit: Maximum number of results. Defaults to 40. Max 40. Set to 0 in order to get all accounts without pagination. Pagination is done with the HTTP Link header.
    :type limit: int
    :param max_id: Return results older than ID
    :type max_id: str
    :param since_id: Return results newer than ID
    :type since_id: str

    :rtype: Union[List[Account], Tuple[List[Account], int], Tuple[List[Account], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_lists_id_accounts_post(id, api_v1_lists_id_accounts_post_request=None):  # noqa: E501
    """api_v1_lists_id_accounts_post

    Add accounts to the given list. Note that the user must be following these accounts. # noqa: E501

    :param id: ID of the list in the database
    :type id: str
    :param api_v1_lists_id_accounts_post_request: 
    :type api_v1_lists_id_accounts_post_request: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_lists_id_accounts_post_request = ApiV1ListsIdAccountsPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_lists_id_get(id):  # noqa: E501
    """api_v1_lists_id_get

    Remove converstation # noqa: E501

    :param id: ID of the list in the database
    :type id: str

    :rtype: Union[List, Tuple[List, int], Tuple[List, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_lists_post(api_v1_lists_post_request=None):  # noqa: E501
    """api_v1_lists_post

    Create a new list. # noqa: E501

    :param api_v1_lists_post_request: 
    :type api_v1_lists_post_request: dict | bytes

    :rtype: Union[List, Tuple[List, int], Tuple[List, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_lists_post_request = ApiV1ListsPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_lists_put(api_v1_lists_put_request=None):  # noqa: E501
    """api_v1_lists_put

    Change the title of a list, or which replies to show. # noqa: E501

    :param api_v1_lists_put_request: 
    :type api_v1_lists_put_request: dict | bytes

    :rtype: Union[List, Tuple[List, int], Tuple[List, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_lists_put_request = ApiV1ListsPutRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_markers_get(timeline):  # noqa: E501
    """api_v1_markers_get

    Get saved timeline position # noqa: E501

    :param timeline: Array of markers to fetch. String enum anyOf home, notifications. If not provided, an empty object will be returned.
    :type timeline: List[]

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_markers_post(body=None):  # noqa: E501
    """api_v1_markers_post

    Get saved timeline position # noqa: E501

    :param body: 
    :type body: 

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_media_id_get(id):  # noqa: E501
    """api_v1_media_id_get

    Get an attachement. # noqa: E501

    :param id: The id of the Attachment entity to be updated.
    :type id: str

    :rtype: Union[Attachment, Tuple[Attachment, int], Tuple[Attachment, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_media_id_post(id, api_v1_media_post_request=None):  # noqa: E501
    """api_v1_media_id_post

    Update an Attachment, before it is attached to a status and posted. # noqa: E501

    :param id: The id of the Attachment entity to be updated.
    :type id: str
    :param api_v1_media_post_request: 
    :type api_v1_media_post_request: dict | bytes

    :rtype: Union[Attachment, Tuple[Attachment, int], Tuple[Attachment, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_media_post_request = ApiV1MediaPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_media_post(api_v1_media_post_request=None):  # noqa: E501
    """api_v1_media_post

    Creates an attachment to be used with a new status. # noqa: E501

    :param api_v1_media_post_request: 
    :type api_v1_media_post_request: dict | bytes

    :rtype: Union[Attachment, Tuple[Attachment, int], Tuple[Attachment, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_media_post_request = ApiV1MediaPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_mutes_get(limit=None, max_id=None, since_id=None):  # noqa: E501
    """api_v1_mutes_get

    Accounts the user has muted. # noqa: E501

    :param limit: 
    :type limit: str
    :param max_id: 
    :type max_id: str
    :param since_id: 
    :type since_id: str

    :rtype: Union[List[Account], Tuple[List[Account], int], Tuple[List[Account], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_notifications_clear_post():  # noqa: E501
    """api_v1_notifications_clear_post

    Clear all notifications from the server. # noqa: E501


    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_notifications_get(limit=None, max_id=None, since_id=None, min_id=None, exclude_types=None, account_id=None):  # noqa: E501
    """api_v1_notifications_get

    Notifications concerning the user. This API returns Link headers containing links to the next/previous page. However, the links can also be constructed dynamically using query params and id values. # noqa: E501

    :param limit: Max number of results to return. Defaults to 20.
    :type limit: int
    :param max_id: Return results older than ID
    :type max_id: str
    :param since_id: Return results newer than ID
    :type since_id: str
    :param min_id: Return results immediately newer than ID
    :type min_id: str
    :param exclude_types: Array of types to exclude (follow, favourite, reblog, mention, poll, follow_request)
    :type exclude_types: List[str]
    :param account_id: Return only notifications received from this account
    :type account_id: str

    :rtype: Union[List[Notification], Tuple[List[Notification], int], Tuple[List[Notification], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_notifications_id_dismiss_post(id):  # noqa: E501
    """api_v1_notifications_id_dismiss_post

    Clear a single notification from the server. # noqa: E501

    :param id: ID of the notification in the database.
    :type id: str

    :rtype: Union[Notification, Tuple[Notification, int], Tuple[Notification, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_notifications_id_get(id):  # noqa: E501
    """api_v1_notifications_id_get

    View information about a notification with a given ID. # noqa: E501

    :param id: ID of the notification in the database.
    :type id: str

    :rtype: Union[Notification, Tuple[Notification, int], Tuple[Notification, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_polls_id_get(id):  # noqa: E501
    """api_v1_polls_id_get

    View a poll. # noqa: E501

    :param id: ID of the poll in the database.
    :type id: str

    :rtype: Union[Poll, Tuple[Poll, int], Tuple[Poll, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_polls_id_post(id, api_v1_polls_id_post_request=None):  # noqa: E501
    """api_v1_polls_id_post

    Vote on a poll. # noqa: E501

    :param id: ID of the poll in the database.
    :type id: str
    :param api_v1_polls_id_post_request: 
    :type api_v1_polls_id_post_request: dict | bytes

    :rtype: Union[Poll, Tuple[Poll, int], Tuple[Poll, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_polls_id_post_request = ApiV1PollsIdPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_preferences_get():  # noqa: E501
    """api_v1_preferences_get

    Shows your 10 most-used tags, with usage history for the past week. # noqa: E501


    :rtype: Union[Preferences, Tuple[Preferences, int], Tuple[Preferences, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_push_subscription_delete():  # noqa: E501
    """api_v1_push_subscription_delete

    Updates the current push subscription. Only the data part can be updated. To change fundamentals, a new subscription must be created instead. # noqa: E501


    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_push_subscription_get():  # noqa: E501
    """api_v1_push_subscription_get

    View the PushSubscription currently associated with this access token. # noqa: E501


    :rtype: Union[PushSubscription, Tuple[PushSubscription, int], Tuple[PushSubscription, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_push_subscription_post(api_v1_push_subscription_post_request=None):  # noqa: E501
    """api_v1_push_subscription_post

    Add a Web Push API subscription to receive notifications. Each access token can have one push subscription. If you create a new subscription, the old subscription is deleted. # noqa: E501

    :param api_v1_push_subscription_post_request: 
    :type api_v1_push_subscription_post_request: dict | bytes

    :rtype: Union[PushSubscription, Tuple[PushSubscription, int], Tuple[PushSubscription, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_push_subscription_post_request = ApiV1PushSubscriptionPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_push_subscription_put(api_v1_push_subscription_put_request=None):  # noqa: E501
    """api_v1_push_subscription_put

    Updates the current push subscription. Only the data part can be updated. To change fundamentals, a new subscription must be created instead. # noqa: E501

    :param api_v1_push_subscription_put_request: 
    :type api_v1_push_subscription_put_request: dict | bytes

    :rtype: Union[PushSubscription, Tuple[PushSubscription, int], Tuple[PushSubscription, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_push_subscription_put_request = ApiV1PushSubscriptionPutRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_reports_post(api_v1_reports_post_request=None):  # noqa: E501
    """api_v1_reports_post

    File a report. # noqa: E501

    :param api_v1_reports_post_request: 
    :type api_v1_reports_post_request: dict | bytes

    :rtype: Union[Report, Tuple[Report, int], Tuple[Report, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_reports_post_request = ApiV1ReportsPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_scheduled_statuses_get(limit=None, max_id=None, since_id=None, min_id=None):  # noqa: E501
    """api_v1_scheduled_statuses_get

    View scheduled statuses # noqa: E501

    :param limit: Max number of results to return. Defaults to 20.
    :type limit: int
    :param max_id: Return results older than ID
    :type max_id: str
    :param since_id: Return results newer than ID
    :type since_id: str
    :param min_id: Return results immediately newer than ID
    :type min_id: str

    :rtype: Union[List[ScheduledStatus], Tuple[List[ScheduledStatus], int], Tuple[List[ScheduledStatus], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_scheduled_statuses_id_delete(id):  # noqa: E501
    """api_v1_scheduled_statuses_id_delete

    Cancel a scheduled status # noqa: E501

    :param id: ID of the scheduled status in the database.
    :type id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_scheduled_statuses_id_get(id):  # noqa: E501
    """api_v1_scheduled_statuses_id_get

    View a single scheduled status # noqa: E501

    :param id: ID of the scheduled status in the database.
    :type id: str

    :rtype: Union[ScheduledStatus, Tuple[ScheduledStatus, int], Tuple[ScheduledStatus, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_scheduled_statuses_id_put(id, api_v1_scheduled_statuses_id_put_request=None):  # noqa: E501
    """api_v1_scheduled_statuses_id_put

    View a single scheduled status # noqa: E501

    :param id: ID of the scheduled status in the database.
    :type id: str
    :param api_v1_scheduled_statuses_id_put_request: 
    :type api_v1_scheduled_statuses_id_put_request: dict | bytes

    :rtype: Union[ScheduledStatus, Tuple[ScheduledStatus, int], Tuple[ScheduledStatus, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_scheduled_statuses_id_put_request = ApiV1ScheduledStatusesIdPutRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_statuses_id_bookmark_post(id):  # noqa: E501
    """api_v1_statuses_id_bookmark_post

    Privately bookmark a status. # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str

    :rtype: Union[Status, Tuple[Status, int], Tuple[Status, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_statuses_id_context_get(id):  # noqa: E501
    """api_v1_statuses_id_context_get

     # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str

    :rtype: Union[Context, Tuple[Context, int], Tuple[Context, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_statuses_id_delete(id):  # noqa: E501
    """api_v1_statuses_id_delete

     # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str

    :rtype: Union[Status, Tuple[Status, int], Tuple[Status, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_statuses_id_favourite_post(id):  # noqa: E501
    """api_v1_statuses_id_favourite_post

    Add a status to your favourites list. # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str

    :rtype: Union[Status, Tuple[Status, int], Tuple[Status, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_statuses_id_favourited_by_get(id):  # noqa: E501
    """api_v1_statuses_id_favourited_by_get

    View who favourited a given status. # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str

    :rtype: Union[Account, Tuple[Account, int], Tuple[Account, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_statuses_id_get(id):  # noqa: E501
    """api_v1_statuses_id_get

     # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str

    :rtype: Union[Status, Tuple[Status, int], Tuple[Status, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_statuses_id_mute_post(id):  # noqa: E501
    """api_v1_statuses_id_mute_post

    Do not receive notifications for the thread that this status is part of. Must be a thread in which you are a participant. # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str

    :rtype: Union[Status, Tuple[Status, int], Tuple[Status, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_statuses_id_pin_post(id):  # noqa: E501
    """api_v1_statuses_id_pin_post

    Feature one of your own public statuses at the top of your profile. # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str

    :rtype: Union[Status, Tuple[Status, int], Tuple[Status, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_statuses_id_reblog_post(id, api_v1_statuses_id_reblog_post_request=None):  # noqa: E501
    """api_v1_statuses_id_reblog_post

    Reshare a status. # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str
    :param api_v1_statuses_id_reblog_post_request: 
    :type api_v1_statuses_id_reblog_post_request: dict | bytes

    :rtype: Union[Status, Tuple[Status, int], Tuple[Status, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_statuses_id_reblog_post_request = ApiV1StatusesIdReblogPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_statuses_id_reblogged_by_get(id):  # noqa: E501
    """api_v1_statuses_id_reblogged_by_get

    View who boosted a given status. # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str

    :rtype: Union[Account, Tuple[Account, int], Tuple[Account, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_statuses_id_unbookmark_post(id):  # noqa: E501
    """api_v1_statuses_id_unbookmark_post

    Remove a status from your private bookmarks. # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str

    :rtype: Union[Status, Tuple[Status, int], Tuple[Status, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_statuses_id_unfavourite_post(id):  # noqa: E501
    """api_v1_statuses_id_unfavourite_post

    Remove a status from your favourites list. # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str

    :rtype: Union[Status, Tuple[Status, int], Tuple[Status, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_statuses_id_unmute_post(id):  # noqa: E501
    """api_v1_statuses_id_unmute_post

    Status&#39;s conversation unmuted, or was already unmuted # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str

    :rtype: Union[Status, Tuple[Status, int], Tuple[Status, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_statuses_id_unpin_post(id):  # noqa: E501
    """api_v1_statuses_id_unpin_post

    Unfeature a status from the top of your profile. # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str

    :rtype: Union[Status, Tuple[Status, int], Tuple[Status, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_statuses_id_unreblog_post(id):  # noqa: E501
    """api_v1_statuses_id_unreblog_post

    Undo a reshare of a status. # noqa: E501

    :param id: Local ID of a status in the database.
    :type id: str

    :rtype: Union[Status, Tuple[Status, int], Tuple[Status, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_statuses_post(idempotency_key=None, api_v1_statuses_post_request_inner=None):  # noqa: E501
    """api_v1_statuses_post

     # noqa: E501

    :param idempotency_key: Prevent duplicate submissions of the same status. Idempotency keys are stored for up to 1 hour, and can be any arbitrary string. Consider using a hash or UUID generated client-side.
    :type idempotency_key: str
    :param api_v1_statuses_post_request_inner: 
    :type api_v1_statuses_post_request_inner: list | bytes

    :rtype: Union[ApiV1StatusesPost200Response, Tuple[ApiV1StatusesPost200Response, int], Tuple[ApiV1StatusesPost200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_statuses_post_request_inner = [ApiV1StatusesPostRequestInner.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def api_v1_suggestions_get(limit=None):  # noqa: E501
    """api_v1_suggestions_get

    Accounts the user has had past positive interactions with, but is not yet following. # noqa: E501

    :param limit: Maximum number of results to return. Defaults to 40.
    :type limit: int

    :rtype: Union[Account, Tuple[Account, int], Tuple[Account, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_suggestions_id_delete(id):  # noqa: E501
    """api_v1_suggestions_id_delete

    Delete user suggestion # noqa: E501

    :param id: id of the account in the database to be removed from suggestions
    :type id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_timelines_home_get(local=None, limit=None, max_id=None, since_id=None, min_id=None):  # noqa: E501
    """api_v1_timelines_home_get

    View statuses from followed users. # noqa: E501

    :param local: Show only local statuses? Defaults to false.
    :type local: bool
    :param limit: Max number of results to return. Defaults to 20.
    :type limit: int
    :param max_id: Return results older than ID
    :type max_id: str
    :param since_id: Return results newer than ID
    :type since_id: str
    :param min_id: Return results immediately newer than ID
    :type min_id: str

    :rtype: Union[List[Status], Tuple[List[Status], int], Tuple[List[Status], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_timelines_list_list_id_get(list_id, limit=None, max_id=None, since_id=None, min_id=None):  # noqa: E501
    """api_v1_timelines_list_list_id_get

    View statuses in the given list timeline. # noqa: E501

    :param list_id: Local ID of the list in the database.
    :type list_id: str
    :param limit: Max number of results to return. Defaults to 20.
    :type limit: int
    :param max_id: Return results older than ID
    :type max_id: str
    :param since_id: Return results newer than ID
    :type since_id: str
    :param min_id: Return results immediately newer than ID
    :type min_id: str

    :rtype: Union[List[Status], Tuple[List[Status], int], Tuple[List[Status], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_timelines_public_get(local=None, remote=None, only_media=None, limit=None, max_id=None, since_id=None, min_id=None):  # noqa: E501
    """api_v1_timelines_public_get

    Public timeline # noqa: E501

    :param local: Show only local statuses? Defaults to false.
    :type local: bool
    :param remote: Show only local statuses? Defaults to false.
    :type remote: bool
    :param only_media: Show only statuses with media attached? Defaults to false..
    :type only_media: bool
    :param limit: Max number of results to return. Defaults to 20.
    :type limit: int
    :param max_id: Return results older than ID
    :type max_id: str
    :param since_id: Return results newer than ID
    :type since_id: str
    :param min_id: Return results immediately newer than ID
    :type min_id: str

    :rtype: Union[List[Status], Tuple[List[Status], int], Tuple[List[Status], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_timelines_tag_hashtag_get(hashtag, local=None, remote=None, only_media=None, limit=None, max_id=None, since_id=None, min_id=None):  # noqa: E501
    """api_v1_timelines_tag_hashtag_get

    View public statuses containing the given hashtag. # noqa: E501

    :param hashtag: Content of a &#x60;#hashtag&#x60;&#x60;, not including &#x60;#&#x60; symbol..
    :type hashtag: str
    :param local: Show only local statuses? Defaults to false.
    :type local: bool
    :param remote: Show only local statuses? Defaults to false.
    :type remote: bool
    :param only_media: Show only statuses with media attached? Defaults to false..
    :type only_media: bool
    :param limit: Max number of results to return. Defaults to 20.
    :type limit: int
    :param max_id: Return results older than ID
    :type max_id: str
    :param since_id: Return results newer than ID
    :type since_id: str
    :param min_id: Return results immediately newer than ID
    :type min_id: str

    :rtype: Union[List[Status], Tuple[List[Status], int], Tuple[List[Status], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_trends_get(limit=None):  # noqa: E501
    """api_v1_trends_get

    Tags that are being used more frequently within the past week. # noqa: E501

    :param limit: Max number of results to return. Defaults to 10.
    :type limit: int

    :rtype: Union[List[Tag], Tuple[List[Tag], int], Tuple[List[Tag], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v2_search_get(q, limit=None, resolve=None, following=None, account_id=None, max_id=None, min_id=None, type=None, exclude_unreviewed=None, offset=None):  # noqa: E501
    """api_v2_search_get

    Search results # noqa: E501

    :param q: What to search for
    :type q: str
    :param limit: Maximum number of results. Defaults to 40.
    :type limit: int
    :param resolve: Attempt WebFinger lookup.
    :type resolve: str
    :param following: Only who the user is following. Defaults to false.
    :type following: bool
    :param account_id: If provided, statuses returned will be authored only by this account
    :type account_id: str
    :param max_id: Return results older than this id
    :type max_id: str
    :param min_id: Return results immediately newer than this id
    :type min_id: str
    :param type: Enum(accounts, hashtags, statuses)
    :type type: str
    :param exclude_unreviewed: Filter out unreviewed tags? Defaults to false. Use true when trying to find trending tags.
    :type exclude_unreviewed: bool
    :param offset: Offset in search results. Used for pagination. Defaults to 0.
    :type offset: int

    :rtype: Union[ApiV2SearchGet200Response, Tuple[ApiV2SearchGet200Response, int], Tuple[ApiV2SearchGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'
