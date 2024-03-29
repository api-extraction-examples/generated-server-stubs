from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SAMLProviderListEntry(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, arn=None, valid_until=None, create_date=None):  # noqa: E501
        """SAMLProviderListEntry - a model defined in OpenAPI

        :param arn: The arn of this SAMLProviderListEntry.  # noqa: E501
        :type arn: str
        :param valid_until: The valid_until of this SAMLProviderListEntry.  # noqa: E501
        :type valid_until: datetime
        :param create_date: The create_date of this SAMLProviderListEntry.  # noqa: E501
        :type create_date: datetime
        """
        self.openapi_types = {
            'arn': str,
            'valid_until': datetime,
            'create_date': datetime
        }

        self.attribute_map = {
            'arn': 'Arn',
            'valid_until': 'ValidUntil',
            'create_date': 'CreateDate'
        }

        self._arn = arn
        self._valid_until = valid_until
        self._create_date = create_date

    @classmethod
    def from_dict(cls, dikt) -> 'SAMLProviderListEntry':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SAMLProviderListEntry of this SAMLProviderListEntry.  # noqa: E501
        :rtype: SAMLProviderListEntry
        """
        return util.deserialize_model(dikt, cls)

    @property
    def arn(self) -> str:
        """Gets the arn of this SAMLProviderListEntry.


        :return: The arn of this SAMLProviderListEntry.
        :rtype: str
        """
        return self._arn

    @arn.setter
    def arn(self, arn: str):
        """Sets the arn of this SAMLProviderListEntry.


        :param arn: The arn of this SAMLProviderListEntry.
        :type arn: str
        """

        self._arn = arn

    @property
    def valid_until(self) -> datetime:
        """Gets the valid_until of this SAMLProviderListEntry.


        :return: The valid_until of this SAMLProviderListEntry.
        :rtype: datetime
        """
        return self._valid_until

    @valid_until.setter
    def valid_until(self, valid_until: datetime):
        """Sets the valid_until of this SAMLProviderListEntry.


        :param valid_until: The valid_until of this SAMLProviderListEntry.
        :type valid_until: datetime
        """

        self._valid_until = valid_until

    @property
    def create_date(self) -> datetime:
        """Gets the create_date of this SAMLProviderListEntry.


        :return: The create_date of this SAMLProviderListEntry.
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date: datetime):
        """Sets the create_date of this SAMLProviderListEntry.


        :param create_date: The create_date of this SAMLProviderListEntry.
        :type create_date: datetime
        """

        self._create_date = create_date
