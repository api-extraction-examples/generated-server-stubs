import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.account import Account  # noqa: E501
from openapi_server.models.api_v1_accounts_id_follow_post_request import ApiV1AccountsIdFollowPostRequest  # noqa: E501
from openapi_server.models.api_v1_accounts_id_mute_post_request import ApiV1AccountsIdMutePostRequest  # noqa: E501
from openapi_server.models.api_v1_accounts_id_note_post_request import ApiV1AccountsIdNotePostRequest  # noqa: E501
from openapi_server.models.api_v1_accounts_post_request import ApiV1AccountsPostRequest  # noqa: E501
from openapi_server.models.api_v1_accounts_update_credentials_patch_request import ApiV1AccountsUpdateCredentialsPatchRequest  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.featured_tag import FeaturedTag  # noqa: E501
from openapi_server.models.identity_proof import IdentityProof  # noqa: E501
from openapi_server.models.relationship import Relationship  # noqa: E501
from openapi_server.models.status import Status  # noqa: E501
from openapi_server import util


def api_v1_accounts_id_block_post(id):  # noqa: E501
    """api_v1_accounts_id_block_post

    Block the given account. Clients should filter statuses from this account if received (e.g. due to a boost in the Home timeline). # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[Relationship, Tuple[Relationship, int], Tuple[Relationship, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_id_featured_tags_get(id):  # noqa: E501
    """api_v1_accounts_id_featured_tags_get

    Tags featured by this account. # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[List[FeaturedTag], Tuple[List[FeaturedTag], int], Tuple[List[FeaturedTag], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_id_follow_post(id, api_v1_accounts_id_follow_post_request=None):  # noqa: E501
    """api_v1_accounts_id_follow_post

    Follow the given account. Can also be used to update whether to show reblogs or enable notifications. # noqa: E501

    :param id: The id of the account in the database
    :type id: str
    :param api_v1_accounts_id_follow_post_request: 
    :type api_v1_accounts_id_follow_post_request: dict | bytes

    :rtype: Union[Relationship, Tuple[Relationship, int], Tuple[Relationship, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_accounts_id_follow_post_request = ApiV1AccountsIdFollowPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_accounts_id_followers_get(id, max_id=None, since_id=None, limit=None):  # noqa: E501
    """api_v1_accounts_id_followers_get

    Accounts which follow the given account, if network is not hidden by the account owner. # noqa: E501

    :param id: The id of the account in the database
    :type id: str
    :param max_id: Internal parameter. Use HTTP &#x60;Link&#x60; header for pagination.
    :type max_id: str
    :param since_id: Internal parameter. Use HTTP &#x60;Link&#x60; header for pagination.
    :type since_id: str
    :param limit: Maximum number of results to return. Defaults to 40.
    :type limit: int

    :rtype: Union[List[Account], Tuple[List[Account], int], Tuple[List[Account], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_id_following_get(id, max_id=None, since_id=None, limit=None):  # noqa: E501
    """api_v1_accounts_id_following_get

    Accounts which the given account is following, if network is not hidden by the account owner. # noqa: E501

    :param id: The id of the account in the database
    :type id: str
    :param max_id: Internal parameter. Use HTTP &#x60;Link&#x60; header for pagination.
    :type max_id: str
    :param since_id: Internal parameter. Use HTTP &#x60;Link&#x60; header for pagination.
    :type since_id: str
    :param limit: Maximum number of results to return. Defaults to 40.
    :type limit: int

    :rtype: Union[List[Account], Tuple[List[Account], int], Tuple[List[Account], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_id_get(id):  # noqa: E501
    """api_v1_accounts_id_get

     # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[Account, Tuple[Account, int], Tuple[Account, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_id_identity_proofs_get(id):  # noqa: E501
    """api_v1_accounts_id_identity_proofs_get

    Array of IdentityProof # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[List[IdentityProof], Tuple[List[IdentityProof], int], Tuple[List[IdentityProof], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_id_lists_get(id):  # noqa: E501
    """api_v1_accounts_id_lists_get

    User lists that you have added this account to. # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[List[List], Tuple[List[List], int], Tuple[List[List], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_id_mute_post(id, api_v1_accounts_id_mute_post_request=None):  # noqa: E501
    """api_v1_accounts_id_mute_post

    Mute the given account. Clients should filter statuses and notifications from this account, if received (e.g. due to a boost in the Home timeline). # noqa: E501

    :param id: The id of the account in the database
    :type id: str
    :param api_v1_accounts_id_mute_post_request: 
    :type api_v1_accounts_id_mute_post_request: dict | bytes

    :rtype: Union[Relationship, Tuple[Relationship, int], Tuple[Relationship, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_accounts_id_mute_post_request = ApiV1AccountsIdMutePostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_accounts_id_note_post(id, api_v1_accounts_id_note_post_request=None):  # noqa: E501
    """api_v1_accounts_id_note_post

    Sets a private note on a user. # noqa: E501

    :param id: The id of the account in the database
    :type id: str
    :param api_v1_accounts_id_note_post_request: 
    :type api_v1_accounts_id_note_post_request: dict | bytes

    :rtype: Union[Relationship, Tuple[Relationship, int], Tuple[Relationship, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_accounts_id_note_post_request = ApiV1AccountsIdNotePostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_accounts_id_pin_post(id):  # noqa: E501
    """api_v1_accounts_id_pin_post

    Add the given account to the user&#39;s featured profiles. (Featured profiles are currently shown on the user&#39;s own public profile.) # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[Relationship, Tuple[Relationship, int], Tuple[Relationship, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_id_statuses_get(id):  # noqa: E501
    """api_v1_accounts_id_statuses_get

    Statuses posted to the given account. # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[List[Status], Tuple[List[Status], int], Tuple[List[Status], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_id_unblock_post(id):  # noqa: E501
    """api_v1_accounts_id_unblock_post

    Block the given account. Clients should filter statuses from this account if received (e.g. due to a boost in the Home timeline). # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[Relationship, Tuple[Relationship, int], Tuple[Relationship, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_id_unfollow_post(id):  # noqa: E501
    """api_v1_accounts_id_unfollow_post

    Unfollow the given account. # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[Relationship, Tuple[Relationship, int], Tuple[Relationship, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_id_unmute_post(id):  # noqa: E501
    """api_v1_accounts_id_unmute_post

    Unmute the given account. # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[Relationship, Tuple[Relationship, int], Tuple[Relationship, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_id_unpin_post(id):  # noqa: E501
    """api_v1_accounts_id_unpin_post

    Remove the given account from the user&#39;s featured profiles. # noqa: E501

    :param id: The id of the account in the database
    :type id: str

    :rtype: Union[Relationship, Tuple[Relationship, int], Tuple[Relationship, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_post(api_v1_accounts_post_request=None):  # noqa: E501
    """api_v1_accounts_post

    Creates a user and account records. Returns an account access token for the app that initiated the request. The app should save this token for later, and should wait for the user to confirm their account by clicking a link in their email inbox. # noqa: E501

    :param api_v1_accounts_post_request: 
    :type api_v1_accounts_post_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_accounts_post_request = ApiV1AccountsPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_accounts_relationships_get(id):  # noqa: E501
    """api_v1_accounts_relationships_get

    Sets a private note on a user. # noqa: E501

    :param id: Array of account IDs to check
    :type id: List[str]

    :rtype: Union[List[Relationship], Tuple[List[Relationship], int], Tuple[List[Relationship], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_search_get(q, limit=None, resolve=None, following=None):  # noqa: E501
    """api_v1_accounts_search_get

    Search for matching accounts by username or display name. # noqa: E501

    :param q: What to search for
    :type q: str
    :param limit: Maximum number of results. Defaults to 40.
    :type limit: int
    :param resolve: Attempt WebFinger lookup. Defaults to false. Use this when &#x60;q&#x60; is an exact address.
    :type resolve: str
    :param following: Only who the user is following. Defaults to false.
    :type following: bool

    :rtype: Union[List[Account], Tuple[List[Account], int], Tuple[List[Account], int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_accounts_update_credentials_patch(api_v1_accounts_update_credentials_patch_request=None):  # noqa: E501
    """api_v1_accounts_update_credentials_patch

    Update the user&#39;s display and preferences. # noqa: E501

    :param api_v1_accounts_update_credentials_patch_request: 
    :type api_v1_accounts_update_credentials_patch_request: dict | bytes

    :rtype: Union[Account, Tuple[Account, int], Tuple[Account, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_accounts_update_credentials_patch_request = ApiV1AccountsUpdateCredentialsPatchRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_accounts_verify_credentials_get():  # noqa: E501
    """api_v1_accounts_verify_credentials_get

    Test to make sure that the user token works. # noqa: E501


    :rtype: Union[Account, Tuple[Account, int], Tuple[Account, int, Dict[str, str]]
    """
    return 'do some magic!'
