from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ControlResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, headers=None, is_successful=None, xml=None):  # noqa: E501
        """ControlResponse - a model defined in OpenAPI

        :param headers: The headers of this ControlResponse.  # noqa: E501
        :type headers: Dict[str, str]
        :param is_successful: The is_successful of this ControlResponse.  # noqa: E501
        :type is_successful: bool
        :param xml: The xml of this ControlResponse.  # noqa: E501
        :type xml: str
        """
        self.openapi_types = {
            'headers': Dict[str, str],
            'is_successful': bool,
            'xml': str
        }

        self.attribute_map = {
            'headers': 'Headers',
            'is_successful': 'IsSuccessful',
            'xml': 'Xml'
        }

        self._headers = headers
        self._is_successful = is_successful
        self._xml = xml

    @classmethod
    def from_dict(cls, dikt) -> 'ControlResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ControlResponse of this ControlResponse.  # noqa: E501
        :rtype: ControlResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def headers(self) -> Dict[str, str]:
        """Gets the headers of this ControlResponse.


        :return: The headers of this ControlResponse.
        :rtype: Dict[str, str]
        """
        return self._headers

    @headers.setter
    def headers(self, headers: Dict[str, str]):
        """Sets the headers of this ControlResponse.


        :param headers: The headers of this ControlResponse.
        :type headers: Dict[str, str]
        """

        self._headers = headers

    @property
    def is_successful(self) -> bool:
        """Gets the is_successful of this ControlResponse.


        :return: The is_successful of this ControlResponse.
        :rtype: bool
        """
        return self._is_successful

    @is_successful.setter
    def is_successful(self, is_successful: bool):
        """Sets the is_successful of this ControlResponse.


        :param is_successful: The is_successful of this ControlResponse.
        :type is_successful: bool
        """

        self._is_successful = is_successful

    @property
    def xml(self) -> str:
        """Gets the xml of this ControlResponse.


        :return: The xml of this ControlResponse.
        :rtype: str
        """
        return self._xml

    @xml.setter
    def xml(self, xml: str):
        """Sets the xml of this ControlResponse.


        :param xml: The xml of this ControlResponse.
        :type xml: str
        """

        self._xml = xml