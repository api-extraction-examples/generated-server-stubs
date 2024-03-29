from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AccessDetail(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, service_name=None, service_namespace=None, region=None, entity_path=None, last_authenticated_time=None, total_authenticated_entities=None):  # noqa: E501
        """AccessDetail - a model defined in OpenAPI

        :param service_name: The service_name of this AccessDetail.  # noqa: E501
        :type service_name: str
        :param service_namespace: The service_namespace of this AccessDetail.  # noqa: E501
        :type service_namespace: str
        :param region: The region of this AccessDetail.  # noqa: E501
        :type region: str
        :param entity_path: The entity_path of this AccessDetail.  # noqa: E501
        :type entity_path: str
        :param last_authenticated_time: The last_authenticated_time of this AccessDetail.  # noqa: E501
        :type last_authenticated_time: datetime
        :param total_authenticated_entities: The total_authenticated_entities of this AccessDetail.  # noqa: E501
        :type total_authenticated_entities: int
        """
        self.openapi_types = {
            'service_name': str,
            'service_namespace': str,
            'region': str,
            'entity_path': str,
            'last_authenticated_time': datetime,
            'total_authenticated_entities': int
        }

        self.attribute_map = {
            'service_name': 'ServiceName',
            'service_namespace': 'ServiceNamespace',
            'region': 'Region',
            'entity_path': 'EntityPath',
            'last_authenticated_time': 'LastAuthenticatedTime',
            'total_authenticated_entities': 'TotalAuthenticatedEntities'
        }

        self._service_name = service_name
        self._service_namespace = service_namespace
        self._region = region
        self._entity_path = entity_path
        self._last_authenticated_time = last_authenticated_time
        self._total_authenticated_entities = total_authenticated_entities

    @classmethod
    def from_dict(cls, dikt) -> 'AccessDetail':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AccessDetail of this AccessDetail.  # noqa: E501
        :rtype: AccessDetail
        """
        return util.deserialize_model(dikt, cls)

    @property
    def service_name(self) -> str:
        """Gets the service_name of this AccessDetail.


        :return: The service_name of this AccessDetail.
        :rtype: str
        """
        return self._service_name

    @service_name.setter
    def service_name(self, service_name: str):
        """Sets the service_name of this AccessDetail.


        :param service_name: The service_name of this AccessDetail.
        :type service_name: str
        """
        if service_name is None:
            raise ValueError("Invalid value for `service_name`, must not be `None`")  # noqa: E501

        self._service_name = service_name

    @property
    def service_namespace(self) -> str:
        """Gets the service_namespace of this AccessDetail.


        :return: The service_namespace of this AccessDetail.
        :rtype: str
        """
        return self._service_namespace

    @service_namespace.setter
    def service_namespace(self, service_namespace: str):
        """Sets the service_namespace of this AccessDetail.


        :param service_namespace: The service_namespace of this AccessDetail.
        :type service_namespace: str
        """
        if service_namespace is None:
            raise ValueError("Invalid value for `service_namespace`, must not be `None`")  # noqa: E501

        self._service_namespace = service_namespace

    @property
    def region(self) -> str:
        """Gets the region of this AccessDetail.


        :return: The region of this AccessDetail.
        :rtype: str
        """
        return self._region

    @region.setter
    def region(self, region: str):
        """Sets the region of this AccessDetail.


        :param region: The region of this AccessDetail.
        :type region: str
        """

        self._region = region

    @property
    def entity_path(self) -> str:
        """Gets the entity_path of this AccessDetail.


        :return: The entity_path of this AccessDetail.
        :rtype: str
        """
        return self._entity_path

    @entity_path.setter
    def entity_path(self, entity_path: str):
        """Sets the entity_path of this AccessDetail.


        :param entity_path: The entity_path of this AccessDetail.
        :type entity_path: str
        """

        self._entity_path = entity_path

    @property
    def last_authenticated_time(self) -> datetime:
        """Gets the last_authenticated_time of this AccessDetail.


        :return: The last_authenticated_time of this AccessDetail.
        :rtype: datetime
        """
        return self._last_authenticated_time

    @last_authenticated_time.setter
    def last_authenticated_time(self, last_authenticated_time: datetime):
        """Sets the last_authenticated_time of this AccessDetail.


        :param last_authenticated_time: The last_authenticated_time of this AccessDetail.
        :type last_authenticated_time: datetime
        """

        self._last_authenticated_time = last_authenticated_time

    @property
    def total_authenticated_entities(self) -> int:
        """Gets the total_authenticated_entities of this AccessDetail.


        :return: The total_authenticated_entities of this AccessDetail.
        :rtype: int
        """
        return self._total_authenticated_entities

    @total_authenticated_entities.setter
    def total_authenticated_entities(self, total_authenticated_entities: int):
        """Sets the total_authenticated_entities of this AccessDetail.


        :param total_authenticated_entities: The total_authenticated_entities of this AccessDetail.
        :type total_authenticated_entities: int
        """

        self._total_authenticated_entities = total_authenticated_entities
