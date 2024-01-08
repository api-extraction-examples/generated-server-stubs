from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class StreamSDKVersionData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, sdk=None, version=None):  # noqa: E501
        """StreamSDKVersionData - a model defined in OpenAPI

        :param sdk: The sdk of this StreamSDKVersionData.  # noqa: E501
        :type sdk: str
        :param version: The version of this StreamSDKVersionData.  # noqa: E501
        :type version: str
        """
        self.openapi_types = {
            'sdk': str,
            'version': str
        }

        self.attribute_map = {
            'sdk': 'sdk',
            'version': 'version'
        }

        self._sdk = sdk
        self._version = version

    @classmethod
    def from_dict(cls, dikt) -> 'StreamSDKVersionData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The StreamSDKVersionData of this StreamSDKVersionData.  # noqa: E501
        :rtype: StreamSDKVersionData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def sdk(self) -> str:
        """Gets the sdk of this StreamSDKVersionData.

        The language of the sdk  # noqa: E501

        :return: The sdk of this StreamSDKVersionData.
        :rtype: str
        """
        return self._sdk

    @sdk.setter
    def sdk(self, sdk: str):
        """Sets the sdk of this StreamSDKVersionData.

        The language of the sdk  # noqa: E501

        :param sdk: The sdk of this StreamSDKVersionData.
        :type sdk: str
        """

        self._sdk = sdk

    @property
    def version(self) -> str:
        """Gets the version of this StreamSDKVersionData.

        The version of the sdk  # noqa: E501

        :return: The version of this StreamSDKVersionData.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version: str):
        """Sets the version of this StreamSDKVersionData.

        The version of the sdk  # noqa: E501

        :param version: The version of this StreamSDKVersionData.
        :type version: str
        """

        self._version = version