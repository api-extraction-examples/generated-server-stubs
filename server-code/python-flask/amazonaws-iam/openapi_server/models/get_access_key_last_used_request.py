from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GetAccessKeyLastUsedRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, access_key_id=None):  # noqa: E501
        """GetAccessKeyLastUsedRequest - a model defined in OpenAPI

        :param access_key_id: The access_key_id of this GetAccessKeyLastUsedRequest.  # noqa: E501
        :type access_key_id: str
        """
        self.openapi_types = {
            'access_key_id': str
        }

        self.attribute_map = {
            'access_key_id': 'AccessKeyId'
        }

        self._access_key_id = access_key_id

    @classmethod
    def from_dict(cls, dikt) -> 'GetAccessKeyLastUsedRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetAccessKeyLastUsedRequest of this GetAccessKeyLastUsedRequest.  # noqa: E501
        :rtype: GetAccessKeyLastUsedRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def access_key_id(self) -> str:
        """Gets the access_key_id of this GetAccessKeyLastUsedRequest.


        :return: The access_key_id of this GetAccessKeyLastUsedRequest.
        :rtype: str
        """
        return self._access_key_id

    @access_key_id.setter
    def access_key_id(self, access_key_id: str):
        """Sets the access_key_id of this GetAccessKeyLastUsedRequest.


        :param access_key_id: The access_key_id of this GetAccessKeyLastUsedRequest.
        :type access_key_id: str
        """
        if access_key_id is None:
            raise ValueError("Invalid value for `access_key_id`, must not be `None`")  # noqa: E501

        self._access_key_id = access_key_id