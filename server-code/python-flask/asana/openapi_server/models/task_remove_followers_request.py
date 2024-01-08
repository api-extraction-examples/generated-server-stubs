from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TaskRemoveFollowersRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, followers=None):  # noqa: E501
        """TaskRemoveFollowersRequest - a model defined in OpenAPI

        :param followers: The followers of this TaskRemoveFollowersRequest.  # noqa: E501
        :type followers: List[str]
        """
        self.openapi_types = {
            'followers': List[str]
        }

        self.attribute_map = {
            'followers': 'followers'
        }

        self._followers = followers

    @classmethod
    def from_dict(cls, dikt) -> 'TaskRemoveFollowersRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskRemoveFollowersRequest of this TaskRemoveFollowersRequest.  # noqa: E501
        :rtype: TaskRemoveFollowersRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def followers(self) -> List[str]:
        """Gets the followers of this TaskRemoveFollowersRequest.

        An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user.  # noqa: E501

        :return: The followers of this TaskRemoveFollowersRequest.
        :rtype: List[str]
        """
        return self._followers

    @followers.setter
    def followers(self, followers: List[str]):
        """Sets the followers of this TaskRemoveFollowersRequest.

        An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user.  # noqa: E501

        :param followers: The followers of this TaskRemoveFollowersRequest.
        :type followers: List[str]
        """
        if followers is None:
            raise ValueError("Invalid value for `followers`, must not be `None`")  # noqa: E501

        self._followers = followers