from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PersonalisedRadioErrorResponseErrors(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, code=None, detail=None, href=None, id=None, status=None, timestamp=None, title=None):  # noqa: E501
        """PersonalisedRadioErrorResponseErrors - a model defined in OpenAPI

        :param code: The code of this PersonalisedRadioErrorResponseErrors.  # noqa: E501
        :type code: str
        :param detail: The detail of this PersonalisedRadioErrorResponseErrors.  # noqa: E501
        :type detail: str
        :param href: The href of this PersonalisedRadioErrorResponseErrors.  # noqa: E501
        :type href: str
        :param id: The id of this PersonalisedRadioErrorResponseErrors.  # noqa: E501
        :type id: str
        :param status: The status of this PersonalisedRadioErrorResponseErrors.  # noqa: E501
        :type status: int
        :param timestamp: The timestamp of this PersonalisedRadioErrorResponseErrors.  # noqa: E501
        :type timestamp: int
        :param title: The title of this PersonalisedRadioErrorResponseErrors.  # noqa: E501
        :type title: str
        """
        self.openapi_types = {
            'code': str,
            'detail': str,
            'href': str,
            'id': str,
            'status': int,
            'timestamp': int,
            'title': str
        }

        self.attribute_map = {
            'code': 'code',
            'detail': 'detail',
            'href': 'href',
            'id': 'id',
            'status': 'status',
            'timestamp': 'timestamp',
            'title': 'title'
        }

        self._code = code
        self._detail = detail
        self._href = href
        self._id = id
        self._status = status
        self._timestamp = timestamp
        self._title = title

    @classmethod
    def from_dict(cls, dikt) -> 'PersonalisedRadioErrorResponseErrors':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PersonalisedRadioErrorResponse_errors of this PersonalisedRadioErrorResponseErrors.  # noqa: E501
        :rtype: PersonalisedRadioErrorResponseErrors
        """
        return util.deserialize_model(dikt, cls)

    @property
    def code(self) -> str:
        """Gets the code of this PersonalisedRadioErrorResponseErrors.


        :return: The code of this PersonalisedRadioErrorResponseErrors.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code: str):
        """Sets the code of this PersonalisedRadioErrorResponseErrors.


        :param code: The code of this PersonalisedRadioErrorResponseErrors.
        :type code: str
        """
        if code is None:
            raise ValueError("Invalid value for `code`, must not be `None`")  # noqa: E501

        self._code = code

    @property
    def detail(self) -> str:
        """Gets the detail of this PersonalisedRadioErrorResponseErrors.


        :return: The detail of this PersonalisedRadioErrorResponseErrors.
        :rtype: str
        """
        return self._detail

    @detail.setter
    def detail(self, detail: str):
        """Sets the detail of this PersonalisedRadioErrorResponseErrors.


        :param detail: The detail of this PersonalisedRadioErrorResponseErrors.
        :type detail: str
        """
        if detail is None:
            raise ValueError("Invalid value for `detail`, must not be `None`")  # noqa: E501

        self._detail = detail

    @property
    def href(self) -> str:
        """Gets the href of this PersonalisedRadioErrorResponseErrors.


        :return: The href of this PersonalisedRadioErrorResponseErrors.
        :rtype: str
        """
        return self._href

    @href.setter
    def href(self, href: str):
        """Sets the href of this PersonalisedRadioErrorResponseErrors.


        :param href: The href of this PersonalisedRadioErrorResponseErrors.
        :type href: str
        """
        if href is None:
            raise ValueError("Invalid value for `href`, must not be `None`")  # noqa: E501

        self._href = href

    @property
    def id(self) -> str:
        """Gets the id of this PersonalisedRadioErrorResponseErrors.


        :return: The id of this PersonalisedRadioErrorResponseErrors.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this PersonalisedRadioErrorResponseErrors.


        :param id: The id of this PersonalisedRadioErrorResponseErrors.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def status(self) -> int:
        """Gets the status of this PersonalisedRadioErrorResponseErrors.


        :return: The status of this PersonalisedRadioErrorResponseErrors.
        :rtype: int
        """
        return self._status

    @status.setter
    def status(self, status: int):
        """Sets the status of this PersonalisedRadioErrorResponseErrors.


        :param status: The status of this PersonalisedRadioErrorResponseErrors.
        :type status: int
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status

    @property
    def timestamp(self) -> int:
        """Gets the timestamp of this PersonalisedRadioErrorResponseErrors.


        :return: The timestamp of this PersonalisedRadioErrorResponseErrors.
        :rtype: int
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp: int):
        """Sets the timestamp of this PersonalisedRadioErrorResponseErrors.


        :param timestamp: The timestamp of this PersonalisedRadioErrorResponseErrors.
        :type timestamp: int
        """
        if timestamp is None:
            raise ValueError("Invalid value for `timestamp`, must not be `None`")  # noqa: E501

        self._timestamp = timestamp

    @property
    def title(self) -> str:
        """Gets the title of this PersonalisedRadioErrorResponseErrors.


        :return: The title of this PersonalisedRadioErrorResponseErrors.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this PersonalisedRadioErrorResponseErrors.


        :param title: The title of this PersonalisedRadioErrorResponseErrors.
        :type title: str
        """
        if title is None:
            raise ValueError("Invalid value for `title`, must not be `None`")  # noqa: E501

        self._title = title