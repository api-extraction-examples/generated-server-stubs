from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.project_compact import ProjectCompact
from openapi_server.models.project_template_compact import ProjectTemplateCompact
from openapi_server.models.task_compact import TaskCompact
from openapi_server import util

from openapi_server.models.project_compact import ProjectCompact  # noqa: E501
from openapi_server.models.project_template_compact import ProjectTemplateCompact  # noqa: E501
from openapi_server.models.task_compact import TaskCompact  # noqa: E501

class JobCompact(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, new_project=None, new_project_template=None, new_task=None, resource_subtype=None, status=None):  # noqa: E501
        """JobCompact - a model defined in OpenAPI

        :param gid: The gid of this JobCompact.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this JobCompact.  # noqa: E501
        :type resource_type: str
        :param new_project: The new_project of this JobCompact.  # noqa: E501
        :type new_project: ProjectCompact
        :param new_project_template: The new_project_template of this JobCompact.  # noqa: E501
        :type new_project_template: ProjectTemplateCompact
        :param new_task: The new_task of this JobCompact.  # noqa: E501
        :type new_task: TaskCompact
        :param resource_subtype: The resource_subtype of this JobCompact.  # noqa: E501
        :type resource_subtype: str
        :param status: The status of this JobCompact.  # noqa: E501
        :type status: str
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'new_project': ProjectCompact,
            'new_project_template': ProjectTemplateCompact,
            'new_task': TaskCompact,
            'resource_subtype': str,
            'status': str
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'new_project': 'new_project',
            'new_project_template': 'new_project_template',
            'new_task': 'new_task',
            'resource_subtype': 'resource_subtype',
            'status': 'status'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._new_project = new_project
        self._new_project_template = new_project_template
        self._new_task = new_task
        self._resource_subtype = resource_subtype
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'JobCompact':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The JobCompact of this JobCompact.  # noqa: E501
        :rtype: JobCompact
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this JobCompact.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this JobCompact.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this JobCompact.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this JobCompact.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this JobCompact.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this JobCompact.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this JobCompact.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this JobCompact.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def new_project(self) -> ProjectCompact:
        """Gets the new_project of this JobCompact.


        :return: The new_project of this JobCompact.
        :rtype: ProjectCompact
        """
        return self._new_project

    @new_project.setter
    def new_project(self, new_project: ProjectCompact):
        """Sets the new_project of this JobCompact.


        :param new_project: The new_project of this JobCompact.
        :type new_project: ProjectCompact
        """

        self._new_project = new_project

    @property
    def new_project_template(self) -> ProjectTemplateCompact:
        """Gets the new_project_template of this JobCompact.


        :return: The new_project_template of this JobCompact.
        :rtype: ProjectTemplateCompact
        """
        return self._new_project_template

    @new_project_template.setter
    def new_project_template(self, new_project_template: ProjectTemplateCompact):
        """Sets the new_project_template of this JobCompact.


        :param new_project_template: The new_project_template of this JobCompact.
        :type new_project_template: ProjectTemplateCompact
        """

        self._new_project_template = new_project_template

    @property
    def new_task(self) -> TaskCompact:
        """Gets the new_task of this JobCompact.


        :return: The new_task of this JobCompact.
        :rtype: TaskCompact
        """
        return self._new_task

    @new_task.setter
    def new_task(self, new_task: TaskCompact):
        """Sets the new_task of this JobCompact.


        :param new_task: The new_task of this JobCompact.
        :type new_task: TaskCompact
        """

        self._new_task = new_task

    @property
    def resource_subtype(self) -> str:
        """Gets the resource_subtype of this JobCompact.

        The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.  # noqa: E501

        :return: The resource_subtype of this JobCompact.
        :rtype: str
        """
        return self._resource_subtype

    @resource_subtype.setter
    def resource_subtype(self, resource_subtype: str):
        """Sets the resource_subtype of this JobCompact.

        The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.  # noqa: E501

        :param resource_subtype: The resource_subtype of this JobCompact.
        :type resource_subtype: str
        """

        self._resource_subtype = resource_subtype

    @property
    def status(self) -> str:
        """Gets the status of this JobCompact.

        The current status of this job. The value is one of: `not_started`, `in_progress`, `succeeded`, or `failed`.  # noqa: E501

        :return: The status of this JobCompact.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status: str):
        """Sets the status of this JobCompact.

        The current status of this job. The value is one of: `not_started`, `in_progress`, `succeeded`, or `failed`.  # noqa: E501

        :param status: The status of this JobCompact.
        :type status: str
        """
        allowed_values = ["not_started", "in_progress", "succeeded", "failed"]  # noqa: E501
        if status not in allowed_values:
            raise ValueError(
                "Invalid value for `status` ({0}), must be one of {1}"
                .format(status, allowed_values)
            )

        self._status = status
