from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GenerateOrganizationsAccessReportResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, job_id=None):  # noqa: E501
        """GenerateOrganizationsAccessReportResponse - a model defined in OpenAPI

        :param job_id: The job_id of this GenerateOrganizationsAccessReportResponse.  # noqa: E501
        :type job_id: str
        """
        self.openapi_types = {
            'job_id': str
        }

        self.attribute_map = {
            'job_id': 'JobId'
        }

        self._job_id = job_id

    @classmethod
    def from_dict(cls, dikt) -> 'GenerateOrganizationsAccessReportResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GenerateOrganizationsAccessReportResponse of this GenerateOrganizationsAccessReportResponse.  # noqa: E501
        :rtype: GenerateOrganizationsAccessReportResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def job_id(self) -> str:
        """Gets the job_id of this GenerateOrganizationsAccessReportResponse.


        :return: The job_id of this GenerateOrganizationsAccessReportResponse.
        :rtype: str
        """
        return self._job_id

    @job_id.setter
    def job_id(self, job_id: str):
        """Sets the job_id of this GenerateOrganizationsAccessReportResponse.


        :param job_id: The job_id of this GenerateOrganizationsAccessReportResponse.
        :type job_id: str
        """

        self._job_id = job_id
