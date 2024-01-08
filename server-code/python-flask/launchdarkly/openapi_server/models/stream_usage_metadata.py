from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class StreamUsageMetadata(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, sdk=None, source=None, version=None):  # noqa: E501
        """StreamUsageMetadata - a model defined in OpenAPI

        :param sdk: The sdk of this StreamUsageMetadata.  # noqa: E501
        :type sdk: str
        :param source: The source of this StreamUsageMetadata.  # noqa: E501
        :type source: str
        :param version: The version of this StreamUsageMetadata.  # noqa: E501
        :type version: str
        """
        self.openapi_types = {
            'sdk': str,
            'source': str,
            'version': str
        }

        self.attribute_map = {
            'sdk': 'sdk',
            'source': 'source',
            'version': 'version'
        }

        self._sdk = sdk
        self._source = source
        self._version = version

    @classmethod
    def from_dict(cls, dikt) -> 'StreamUsageMetadata':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The StreamUsageMetadata of this StreamUsageMetadata.  # noqa: E501
        :rtype: StreamUsageMetadata
        """
        return util.deserialize_model(dikt, cls)

    @property
    def sdk(self) -> str:
        """Gets the sdk of this StreamUsageMetadata.

        The language of the sdk  # noqa: E501

        :return: The sdk of this StreamUsageMetadata.
        :rtype: str
        """
        return self._sdk

    @sdk.setter
    def sdk(self, sdk: str):
        """Sets the sdk of this StreamUsageMetadata.

        The language of the sdk  # noqa: E501

        :param sdk: The sdk of this StreamUsageMetadata.
        :type sdk: str
        """

        self._sdk = sdk

    @property
    def source(self) -> str:
        """Gets the source of this StreamUsageMetadata.


        :return: The source of this StreamUsageMetadata.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source: str):
        """Sets the source of this StreamUsageMetadata.


        :param source: The source of this StreamUsageMetadata.
        :type source: str
        """

        self._source = source

    @property
    def version(self) -> str:
        """Gets the version of this StreamUsageMetadata.

        The version of the SDK  # noqa: E501

        :return: The version of this StreamUsageMetadata.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version: str):
        """Sets the version of this StreamUsageMetadata.

        The version of the SDK  # noqa: E501

        :param version: The version of this StreamUsageMetadata.
        :type version: str
        """

        self._version = version
