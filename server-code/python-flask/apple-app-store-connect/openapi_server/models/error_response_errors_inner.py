from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.error_response_errors_inner_source import ErrorResponseErrorsInnerSource
from openapi_server import util

from openapi_server.models.error_response_errors_inner_source import ErrorResponseErrorsInnerSource  # noqa: E501

class ErrorResponseErrorsInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, code=None, detail=None, id=None, source=None, status=None, title=None):  # noqa: E501
        """ErrorResponseErrorsInner - a model defined in OpenAPI

        :param code: The code of this ErrorResponseErrorsInner.  # noqa: E501
        :type code: str
        :param detail: The detail of this ErrorResponseErrorsInner.  # noqa: E501
        :type detail: str
        :param id: The id of this ErrorResponseErrorsInner.  # noqa: E501
        :type id: str
        :param source: The source of this ErrorResponseErrorsInner.  # noqa: E501
        :type source: ErrorResponseErrorsInnerSource
        :param status: The status of this ErrorResponseErrorsInner.  # noqa: E501
        :type status: str
        :param title: The title of this ErrorResponseErrorsInner.  # noqa: E501
        :type title: str
        """
        self.openapi_types = {
            'code': str,
            'detail': str,
            'id': str,
            'source': ErrorResponseErrorsInnerSource,
            'status': str,
            'title': str
        }

        self.attribute_map = {
            'code': 'code',
            'detail': 'detail',
            'id': 'id',
            'source': 'source',
            'status': 'status',
            'title': 'title'
        }

        self._code = code
        self._detail = detail
        self._id = id
        self._source = source
        self._status = status
        self._title = title

    @classmethod
    def from_dict(cls, dikt) -> 'ErrorResponseErrorsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ErrorResponse_errors_inner of this ErrorResponseErrorsInner.  # noqa: E501
        :rtype: ErrorResponseErrorsInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def code(self) -> str:
        """Gets the code of this ErrorResponseErrorsInner.


        :return: The code of this ErrorResponseErrorsInner.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code: str):
        """Sets the code of this ErrorResponseErrorsInner.


        :param code: The code of this ErrorResponseErrorsInner.
        :type code: str
        """
        if code is None:
            raise ValueError("Invalid value for `code`, must not be `None`")  # noqa: E501

        self._code = code

    @property
    def detail(self) -> str:
        """Gets the detail of this ErrorResponseErrorsInner.


        :return: The detail of this ErrorResponseErrorsInner.
        :rtype: str
        """
        return self._detail

    @detail.setter
    def detail(self, detail: str):
        """Sets the detail of this ErrorResponseErrorsInner.


        :param detail: The detail of this ErrorResponseErrorsInner.
        :type detail: str
        """
        if detail is None:
            raise ValueError("Invalid value for `detail`, must not be `None`")  # noqa: E501

        self._detail = detail

    @property
    def id(self) -> str:
        """Gets the id of this ErrorResponseErrorsInner.


        :return: The id of this ErrorResponseErrorsInner.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this ErrorResponseErrorsInner.


        :param id: The id of this ErrorResponseErrorsInner.
        :type id: str
        """

        self._id = id

    @property
    def source(self) -> ErrorResponseErrorsInnerSource:
        """Gets the source of this ErrorResponseErrorsInner.


        :return: The source of this ErrorResponseErrorsInner.
        :rtype: ErrorResponseErrorsInnerSource
        """
        return self._source

    @source.setter
    def source(self, source: ErrorResponseErrorsInnerSource):
        """Sets the source of this ErrorResponseErrorsInner.


        :param source: The source of this ErrorResponseErrorsInner.
        :type source: ErrorResponseErrorsInnerSource
        """

        self._source = source

    @property
    def status(self) -> str:
        """Gets the status of this ErrorResponseErrorsInner.


        :return: The status of this ErrorResponseErrorsInner.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status: str):
        """Sets the status of this ErrorResponseErrorsInner.


        :param status: The status of this ErrorResponseErrorsInner.
        :type status: str
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status

    @property
    def title(self) -> str:
        """Gets the title of this ErrorResponseErrorsInner.


        :return: The title of this ErrorResponseErrorsInner.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ErrorResponseErrorsInner.


        :param title: The title of this ErrorResponseErrorsInner.
        :type title: str
        """
        if title is None:
            raise ValueError("Invalid value for `title`, must not be `None`")  # noqa: E501

        self._title = title