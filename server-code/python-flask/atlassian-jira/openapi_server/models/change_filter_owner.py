from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ChangeFilterOwner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, account_id=None):  # noqa: E501
        """ChangeFilterOwner - a model defined in OpenAPI

        :param account_id: The account_id of this ChangeFilterOwner.  # noqa: E501
        :type account_id: str
        """
        self.openapi_types = {
            'account_id': str
        }

        self.attribute_map = {
            'account_id': 'accountId'
        }

        self._account_id = account_id

    @classmethod
    def from_dict(cls, dikt) -> 'ChangeFilterOwner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ChangeFilterOwner of this ChangeFilterOwner.  # noqa: E501
        :rtype: ChangeFilterOwner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def account_id(self) -> str:
        """Gets the account_id of this ChangeFilterOwner.

        The account ID of the new owner.  # noqa: E501

        :return: The account_id of this ChangeFilterOwner.
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id: str):
        """Sets the account_id of this ChangeFilterOwner.

        The account ID of the new owner.  # noqa: E501

        :param account_id: The account_id of this ChangeFilterOwner.
        :type account_id: str
        """
        if account_id is None:
            raise ValueError("Invalid value for `account_id`, must not be `None`")  # noqa: E501

        self._account_id = account_id
