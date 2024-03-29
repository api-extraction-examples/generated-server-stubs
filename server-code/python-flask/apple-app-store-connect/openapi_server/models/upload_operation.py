from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.upload_operation_header import UploadOperationHeader
from openapi_server import util

from openapi_server.models.upload_operation_header import UploadOperationHeader  # noqa: E501

class UploadOperation(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, length=None, method=None, offset=None, request_headers=None, url=None):  # noqa: E501
        """UploadOperation - a model defined in OpenAPI

        :param length: The length of this UploadOperation.  # noqa: E501
        :type length: int
        :param method: The method of this UploadOperation.  # noqa: E501
        :type method: str
        :param offset: The offset of this UploadOperation.  # noqa: E501
        :type offset: int
        :param request_headers: The request_headers of this UploadOperation.  # noqa: E501
        :type request_headers: List[UploadOperationHeader]
        :param url: The url of this UploadOperation.  # noqa: E501
        :type url: str
        """
        self.openapi_types = {
            'length': int,
            'method': str,
            'offset': int,
            'request_headers': List[UploadOperationHeader],
            'url': str
        }

        self.attribute_map = {
            'length': 'length',
            'method': 'method',
            'offset': 'offset',
            'request_headers': 'requestHeaders',
            'url': 'url'
        }

        self._length = length
        self._method = method
        self._offset = offset
        self._request_headers = request_headers
        self._url = url

    @classmethod
    def from_dict(cls, dikt) -> 'UploadOperation':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UploadOperation of this UploadOperation.  # noqa: E501
        :rtype: UploadOperation
        """
        return util.deserialize_model(dikt, cls)

    @property
    def length(self) -> int:
        """Gets the length of this UploadOperation.


        :return: The length of this UploadOperation.
        :rtype: int
        """
        return self._length

    @length.setter
    def length(self, length: int):
        """Sets the length of this UploadOperation.


        :param length: The length of this UploadOperation.
        :type length: int
        """

        self._length = length

    @property
    def method(self) -> str:
        """Gets the method of this UploadOperation.


        :return: The method of this UploadOperation.
        :rtype: str
        """
        return self._method

    @method.setter
    def method(self, method: str):
        """Sets the method of this UploadOperation.


        :param method: The method of this UploadOperation.
        :type method: str
        """

        self._method = method

    @property
    def offset(self) -> int:
        """Gets the offset of this UploadOperation.


        :return: The offset of this UploadOperation.
        :rtype: int
        """
        return self._offset

    @offset.setter
    def offset(self, offset: int):
        """Sets the offset of this UploadOperation.


        :param offset: The offset of this UploadOperation.
        :type offset: int
        """

        self._offset = offset

    @property
    def request_headers(self) -> List[UploadOperationHeader]:
        """Gets the request_headers of this UploadOperation.


        :return: The request_headers of this UploadOperation.
        :rtype: List[UploadOperationHeader]
        """
        return self._request_headers

    @request_headers.setter
    def request_headers(self, request_headers: List[UploadOperationHeader]):
        """Sets the request_headers of this UploadOperation.


        :param request_headers: The request_headers of this UploadOperation.
        :type request_headers: List[UploadOperationHeader]
        """

        self._request_headers = request_headers

    @property
    def url(self) -> str:
        """Gets the url of this UploadOperation.


        :return: The url of this UploadOperation.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this UploadOperation.


        :param url: The url of this UploadOperation.
        :type url: str
        """

        self._url = url
