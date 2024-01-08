from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PinRedeemResult(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, success=None, users_reset=None):  # noqa: E501
        """PinRedeemResult - a model defined in OpenAPI

        :param success: The success of this PinRedeemResult.  # noqa: E501
        :type success: bool
        :param users_reset: The users_reset of this PinRedeemResult.  # noqa: E501
        :type users_reset: List[str]
        """
        self.openapi_types = {
            'success': bool,
            'users_reset': List[str]
        }

        self.attribute_map = {
            'success': 'Success',
            'users_reset': 'UsersReset'
        }

        self._success = success
        self._users_reset = users_reset

    @classmethod
    def from_dict(cls, dikt) -> 'PinRedeemResult':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PinRedeemResult of this PinRedeemResult.  # noqa: E501
        :rtype: PinRedeemResult
        """
        return util.deserialize_model(dikt, cls)

    @property
    def success(self) -> bool:
        """Gets the success of this PinRedeemResult.

        Gets or sets a value indicating whether this MediaBrowser.Model.Users.PinRedeemResult is success.  # noqa: E501

        :return: The success of this PinRedeemResult.
        :rtype: bool
        """
        return self._success

    @success.setter
    def success(self, success: bool):
        """Sets the success of this PinRedeemResult.

        Gets or sets a value indicating whether this MediaBrowser.Model.Users.PinRedeemResult is success.  # noqa: E501

        :param success: The success of this PinRedeemResult.
        :type success: bool
        """

        self._success = success

    @property
    def users_reset(self) -> List[str]:
        """Gets the users_reset of this PinRedeemResult.

        Gets or sets the users reset.  # noqa: E501

        :return: The users_reset of this PinRedeemResult.
        :rtype: List[str]
        """
        return self._users_reset

    @users_reset.setter
    def users_reset(self, users_reset: List[str]):
        """Sets the users_reset of this PinRedeemResult.

        Gets or sets the users reset.  # noqa: E501

        :param users_reset: The users_reset of this PinRedeemResult.
        :type users_reset: List[str]
        """

        self._users_reset = users_reset
