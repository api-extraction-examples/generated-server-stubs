from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.organization_export_request import OrganizationExportRequest
from openapi_server import util

from openapi_server.models.organization_export_request import OrganizationExportRequest  # noqa: E501

class CreateOrganizationExportRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """CreateOrganizationExportRequest - a model defined in OpenAPI

        :param data: The data of this CreateOrganizationExportRequest.  # noqa: E501
        :type data: OrganizationExportRequest
        """
        self.openapi_types = {
            'data': OrganizationExportRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'CreateOrganizationExportRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The createOrganizationExport_request of this CreateOrganizationExportRequest.  # noqa: E501
        :rtype: CreateOrganizationExportRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> OrganizationExportRequest:
        """Gets the data of this CreateOrganizationExportRequest.


        :return: The data of this CreateOrganizationExportRequest.
        :rtype: OrganizationExportRequest
        """
        return self._data

    @data.setter
    def data(self, data: OrganizationExportRequest):
        """Sets the data of this CreateOrganizationExportRequest.


        :param data: The data of this CreateOrganizationExportRequest.
        :type data: OrganizationExportRequest
        """

        self._data = data