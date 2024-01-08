import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.member import Member  # noqa: E501
from openapi_server.models.members import Members  # noqa: E501
from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_members_request_inner import PostMembersRequestInner  # noqa: E501
from openapi_server import util


def delete_member(member_id):  # noqa: E501
    """Delete a team member by ID.

     # noqa: E501

    :param member_id: The member ID.
    :type member_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_me():  # noqa: E501
    """Get the current team member associated with the token

     # noqa: E501


    :rtype: Union[Member, Tuple[Member, int], Tuple[Member, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_member(member_id):  # noqa: E501
    """Get a single team member by ID.

     # noqa: E501

    :param member_id: The member ID.
    :type member_id: str

    :rtype: Union[Member, Tuple[Member, int], Tuple[Member, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_members(limit=None, offset=None, filter=None, sort=None):  # noqa: E501
    """Returns a list of all members in the account.

     # noqa: E501

    :param limit: The number of objects to return. Defaults to -1, which returns everything.
    :type limit: 
    :param offset: Where to start in the list. This is for use with pagination. For example, an offset of 10 would skip the first 10 items and then return the next limit items.
    :type offset: 
    :param filter: A comma-separated list of filters. Each filter is of the form field:value.
    :type filter: str
    :param sort: A comma-separated list of fields to sort by. A field prefixed by a - will be sorted in descending order.
    :type sort: str

    :rtype: Union[Members, Tuple[Members, int], Tuple[Members, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_member(member_id, patch_delta):  # noqa: E501
    """Modify a team member by ID.

     # noqa: E501

    :param member_id: The member ID.
    :type member_id: str
    :param patch_delta: Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39;
    :type patch_delta: list | bytes

    :rtype: Union[Member, Tuple[Member, int], Tuple[Member, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        patch_delta = [PatchOperation.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_members(members_body):  # noqa: E501
    """Invite new members.

     # noqa: E501

    :param members_body: New members to invite.
    :type members_body: list | bytes

    :rtype: Union[Members, Tuple[Members, int], Tuple[Members, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        members_body = [PostMembersRequestInner.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
