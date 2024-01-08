from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class MusicPopularityError(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, errors=None, _schema=None):  # noqa: E501
        """MusicPopularityError - a model defined in OpenAPI

        :param errors: The errors of this MusicPopularityError.  # noqa: E501
        :type errors: List[str]
        :param _schema: The _schema of this MusicPopularityError.  # noqa: E501
        :type _schema: str
        """
        self.openapi_types = {
            'errors': List[str],
            '_schema': str
        }

        self.attribute_map = {
            'errors': 'errors',
            '_schema': 'schema'
        }

        self._errors = errors
        self.__schema = _schema

    @classmethod
    def from_dict(cls, dikt) -> 'MusicPopularityError':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MusicPopularityError of this MusicPopularityError.  # noqa: E501
        :rtype: MusicPopularityError
        """
        return util.deserialize_model(dikt, cls)

    @property
    def errors(self) -> List[str]:
        """Gets the errors of this MusicPopularityError.


        :return: The errors of this MusicPopularityError.
        :rtype: List[str]
        """
        return self._errors

    @errors.setter
    def errors(self, errors: List[str]):
        """Sets the errors of this MusicPopularityError.


        :param errors: The errors of this MusicPopularityError.
        :type errors: List[str]
        """

        self._errors = errors

    @property
    def _schema(self) -> str:
        """Gets the _schema of this MusicPopularityError.


        :return: The _schema of this MusicPopularityError.
        :rtype: str
        """
        return self.__schema

    @_schema.setter
    def _schema(self, _schema: str):
        """Sets the _schema of this MusicPopularityError.


        :param _schema: The _schema of this MusicPopularityError.
        :type _schema: str
        """

        self.__schema = _schema
