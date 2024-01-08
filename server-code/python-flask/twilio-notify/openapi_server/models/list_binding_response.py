from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.list_credential_response_meta import ListCredentialResponseMeta
from openapi_server.models.notify_v1_service_binding import NotifyV1ServiceBinding
from openapi_server import util

from openapi_server.models.list_credential_response_meta import ListCredentialResponseMeta  # noqa: E501
from openapi_server.models.notify_v1_service_binding import NotifyV1ServiceBinding  # noqa: E501

class ListBindingResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, bindings=None, meta=None):  # noqa: E501
        """ListBindingResponse - a model defined in OpenAPI

        :param bindings: The bindings of this ListBindingResponse.  # noqa: E501
        :type bindings: List[NotifyV1ServiceBinding]
        :param meta: The meta of this ListBindingResponse.  # noqa: E501
        :type meta: ListCredentialResponseMeta
        """
        self.openapi_types = {
            'bindings': List[NotifyV1ServiceBinding],
            'meta': ListCredentialResponseMeta
        }

        self.attribute_map = {
            'bindings': 'bindings',
            'meta': 'meta'
        }

        self._bindings = bindings
        self._meta = meta

    @classmethod
    def from_dict(cls, dikt) -> 'ListBindingResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListBindingResponse of this ListBindingResponse.  # noqa: E501
        :rtype: ListBindingResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def bindings(self) -> List[NotifyV1ServiceBinding]:
        """Gets the bindings of this ListBindingResponse.


        :return: The bindings of this ListBindingResponse.
        :rtype: List[NotifyV1ServiceBinding]
        """
        return self._bindings

    @bindings.setter
    def bindings(self, bindings: List[NotifyV1ServiceBinding]):
        """Sets the bindings of this ListBindingResponse.


        :param bindings: The bindings of this ListBindingResponse.
        :type bindings: List[NotifyV1ServiceBinding]
        """

        self._bindings = bindings

    @property
    def meta(self) -> ListCredentialResponseMeta:
        """Gets the meta of this ListBindingResponse.


        :return: The meta of this ListBindingResponse.
        :rtype: ListCredentialResponseMeta
        """
        return self._meta

    @meta.setter
    def meta(self, meta: ListCredentialResponseMeta):
        """Sets the meta of this ListBindingResponse.


        :param meta: The meta of this ListBindingResponse.
        :type meta: ListCredentialResponseMeta
        """

        self._meta = meta