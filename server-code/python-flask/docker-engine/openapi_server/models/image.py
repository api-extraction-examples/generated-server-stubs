from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.container_config import ContainerConfig
from openapi_server.models.graph_driver_data import GraphDriverData
from openapi_server.models.image_metadata import ImageMetadata
from openapi_server.models.image_root_fs import ImageRootFS
from openapi_server import util

from openapi_server.models.container_config import ContainerConfig  # noqa: E501
from openapi_server.models.graph_driver_data import GraphDriverData  # noqa: E501
from openapi_server.models.image_metadata import ImageMetadata  # noqa: E501
from openapi_server.models.image_root_fs import ImageRootFS  # noqa: E501

class Image(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, architecture=None, author=None, comment=None, config=None, container=None, container_config=None, created=None, docker_version=None, graph_driver=None, id=None, metadata=None, os=None, os_version=None, parent=None, repo_digests=None, repo_tags=None, root_fs=None, size=None, virtual_size=None):  # noqa: E501
        """Image - a model defined in OpenAPI

        :param architecture: The architecture of this Image.  # noqa: E501
        :type architecture: str
        :param author: The author of this Image.  # noqa: E501
        :type author: str
        :param comment: The comment of this Image.  # noqa: E501
        :type comment: str
        :param config: The config of this Image.  # noqa: E501
        :type config: ContainerConfig
        :param container: The container of this Image.  # noqa: E501
        :type container: str
        :param container_config: The container_config of this Image.  # noqa: E501
        :type container_config: ContainerConfig
        :param created: The created of this Image.  # noqa: E501
        :type created: str
        :param docker_version: The docker_version of this Image.  # noqa: E501
        :type docker_version: str
        :param graph_driver: The graph_driver of this Image.  # noqa: E501
        :type graph_driver: GraphDriverData
        :param id: The id of this Image.  # noqa: E501
        :type id: str
        :param metadata: The metadata of this Image.  # noqa: E501
        :type metadata: ImageMetadata
        :param os: The os of this Image.  # noqa: E501
        :type os: str
        :param os_version: The os_version of this Image.  # noqa: E501
        :type os_version: str
        :param parent: The parent of this Image.  # noqa: E501
        :type parent: str
        :param repo_digests: The repo_digests of this Image.  # noqa: E501
        :type repo_digests: List[str]
        :param repo_tags: The repo_tags of this Image.  # noqa: E501
        :type repo_tags: List[str]
        :param root_fs: The root_fs of this Image.  # noqa: E501
        :type root_fs: ImageRootFS
        :param size: The size of this Image.  # noqa: E501
        :type size: int
        :param virtual_size: The virtual_size of this Image.  # noqa: E501
        :type virtual_size: int
        """
        self.openapi_types = {
            'architecture': str,
            'author': str,
            'comment': str,
            'config': ContainerConfig,
            'container': str,
            'container_config': ContainerConfig,
            'created': str,
            'docker_version': str,
            'graph_driver': GraphDriverData,
            'id': str,
            'metadata': ImageMetadata,
            'os': str,
            'os_version': str,
            'parent': str,
            'repo_digests': List[str],
            'repo_tags': List[str],
            'root_fs': ImageRootFS,
            'size': int,
            'virtual_size': int
        }

        self.attribute_map = {
            'architecture': 'Architecture',
            'author': 'Author',
            'comment': 'Comment',
            'config': 'Config',
            'container': 'Container',
            'container_config': 'ContainerConfig',
            'created': 'Created',
            'docker_version': 'DockerVersion',
            'graph_driver': 'GraphDriver',
            'id': 'Id',
            'metadata': 'Metadata',
            'os': 'Os',
            'os_version': 'OsVersion',
            'parent': 'Parent',
            'repo_digests': 'RepoDigests',
            'repo_tags': 'RepoTags',
            'root_fs': 'RootFS',
            'size': 'Size',
            'virtual_size': 'VirtualSize'
        }

        self._architecture = architecture
        self._author = author
        self._comment = comment
        self._config = config
        self._container = container
        self._container_config = container_config
        self._created = created
        self._docker_version = docker_version
        self._graph_driver = graph_driver
        self._id = id
        self._metadata = metadata
        self._os = os
        self._os_version = os_version
        self._parent = parent
        self._repo_digests = repo_digests
        self._repo_tags = repo_tags
        self._root_fs = root_fs
        self._size = size
        self._virtual_size = virtual_size

    @classmethod
    def from_dict(cls, dikt) -> 'Image':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Image of this Image.  # noqa: E501
        :rtype: Image
        """
        return util.deserialize_model(dikt, cls)

    @property
    def architecture(self) -> str:
        """Gets the architecture of this Image.


        :return: The architecture of this Image.
        :rtype: str
        """
        return self._architecture

    @architecture.setter
    def architecture(self, architecture: str):
        """Sets the architecture of this Image.


        :param architecture: The architecture of this Image.
        :type architecture: str
        """
        if architecture is None:
            raise ValueError("Invalid value for `architecture`, must not be `None`")  # noqa: E501

        self._architecture = architecture

    @property
    def author(self) -> str:
        """Gets the author of this Image.


        :return: The author of this Image.
        :rtype: str
        """
        return self._author

    @author.setter
    def author(self, author: str):
        """Sets the author of this Image.


        :param author: The author of this Image.
        :type author: str
        """
        if author is None:
            raise ValueError("Invalid value for `author`, must not be `None`")  # noqa: E501

        self._author = author

    @property
    def comment(self) -> str:
        """Gets the comment of this Image.


        :return: The comment of this Image.
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment: str):
        """Sets the comment of this Image.


        :param comment: The comment of this Image.
        :type comment: str
        """
        if comment is None:
            raise ValueError("Invalid value for `comment`, must not be `None`")  # noqa: E501

        self._comment = comment

    @property
    def config(self) -> ContainerConfig:
        """Gets the config of this Image.


        :return: The config of this Image.
        :rtype: ContainerConfig
        """
        return self._config

    @config.setter
    def config(self, config: ContainerConfig):
        """Sets the config of this Image.


        :param config: The config of this Image.
        :type config: ContainerConfig
        """

        self._config = config

    @property
    def container(self) -> str:
        """Gets the container of this Image.


        :return: The container of this Image.
        :rtype: str
        """
        return self._container

    @container.setter
    def container(self, container: str):
        """Sets the container of this Image.


        :param container: The container of this Image.
        :type container: str
        """
        if container is None:
            raise ValueError("Invalid value for `container`, must not be `None`")  # noqa: E501

        self._container = container

    @property
    def container_config(self) -> ContainerConfig:
        """Gets the container_config of this Image.


        :return: The container_config of this Image.
        :rtype: ContainerConfig
        """
        return self._container_config

    @container_config.setter
    def container_config(self, container_config: ContainerConfig):
        """Sets the container_config of this Image.


        :param container_config: The container_config of this Image.
        :type container_config: ContainerConfig
        """

        self._container_config = container_config

    @property
    def created(self) -> str:
        """Gets the created of this Image.


        :return: The created of this Image.
        :rtype: str
        """
        return self._created

    @created.setter
    def created(self, created: str):
        """Sets the created of this Image.


        :param created: The created of this Image.
        :type created: str
        """
        if created is None:
            raise ValueError("Invalid value for `created`, must not be `None`")  # noqa: E501

        self._created = created

    @property
    def docker_version(self) -> str:
        """Gets the docker_version of this Image.


        :return: The docker_version of this Image.
        :rtype: str
        """
        return self._docker_version

    @docker_version.setter
    def docker_version(self, docker_version: str):
        """Sets the docker_version of this Image.


        :param docker_version: The docker_version of this Image.
        :type docker_version: str
        """
        if docker_version is None:
            raise ValueError("Invalid value for `docker_version`, must not be `None`")  # noqa: E501

        self._docker_version = docker_version

    @property
    def graph_driver(self) -> GraphDriverData:
        """Gets the graph_driver of this Image.


        :return: The graph_driver of this Image.
        :rtype: GraphDriverData
        """
        return self._graph_driver

    @graph_driver.setter
    def graph_driver(self, graph_driver: GraphDriverData):
        """Sets the graph_driver of this Image.


        :param graph_driver: The graph_driver of this Image.
        :type graph_driver: GraphDriverData
        """
        if graph_driver is None:
            raise ValueError("Invalid value for `graph_driver`, must not be `None`")  # noqa: E501

        self._graph_driver = graph_driver

    @property
    def id(self) -> str:
        """Gets the id of this Image.


        :return: The id of this Image.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Image.


        :param id: The id of this Image.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def metadata(self) -> ImageMetadata:
        """Gets the metadata of this Image.


        :return: The metadata of this Image.
        :rtype: ImageMetadata
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata: ImageMetadata):
        """Sets the metadata of this Image.


        :param metadata: The metadata of this Image.
        :type metadata: ImageMetadata
        """

        self._metadata = metadata

    @property
    def os(self) -> str:
        """Gets the os of this Image.


        :return: The os of this Image.
        :rtype: str
        """
        return self._os

    @os.setter
    def os(self, os: str):
        """Sets the os of this Image.


        :param os: The os of this Image.
        :type os: str
        """
        if os is None:
            raise ValueError("Invalid value for `os`, must not be `None`")  # noqa: E501

        self._os = os

    @property
    def os_version(self) -> str:
        """Gets the os_version of this Image.


        :return: The os_version of this Image.
        :rtype: str
        """
        return self._os_version

    @os_version.setter
    def os_version(self, os_version: str):
        """Sets the os_version of this Image.


        :param os_version: The os_version of this Image.
        :type os_version: str
        """

        self._os_version = os_version

    @property
    def parent(self) -> str:
        """Gets the parent of this Image.


        :return: The parent of this Image.
        :rtype: str
        """
        return self._parent

    @parent.setter
    def parent(self, parent: str):
        """Sets the parent of this Image.


        :param parent: The parent of this Image.
        :type parent: str
        """
        if parent is None:
            raise ValueError("Invalid value for `parent`, must not be `None`")  # noqa: E501

        self._parent = parent

    @property
    def repo_digests(self) -> List[str]:
        """Gets the repo_digests of this Image.


        :return: The repo_digests of this Image.
        :rtype: List[str]
        """
        return self._repo_digests

    @repo_digests.setter
    def repo_digests(self, repo_digests: List[str]):
        """Sets the repo_digests of this Image.


        :param repo_digests: The repo_digests of this Image.
        :type repo_digests: List[str]
        """

        self._repo_digests = repo_digests

    @property
    def repo_tags(self) -> List[str]:
        """Gets the repo_tags of this Image.


        :return: The repo_tags of this Image.
        :rtype: List[str]
        """
        return self._repo_tags

    @repo_tags.setter
    def repo_tags(self, repo_tags: List[str]):
        """Sets the repo_tags of this Image.


        :param repo_tags: The repo_tags of this Image.
        :type repo_tags: List[str]
        """

        self._repo_tags = repo_tags

    @property
    def root_fs(self) -> ImageRootFS:
        """Gets the root_fs of this Image.


        :return: The root_fs of this Image.
        :rtype: ImageRootFS
        """
        return self._root_fs

    @root_fs.setter
    def root_fs(self, root_fs: ImageRootFS):
        """Sets the root_fs of this Image.


        :param root_fs: The root_fs of this Image.
        :type root_fs: ImageRootFS
        """
        if root_fs is None:
            raise ValueError("Invalid value for `root_fs`, must not be `None`")  # noqa: E501

        self._root_fs = root_fs

    @property
    def size(self) -> int:
        """Gets the size of this Image.


        :return: The size of this Image.
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size: int):
        """Sets the size of this Image.


        :param size: The size of this Image.
        :type size: int
        """
        if size is None:
            raise ValueError("Invalid value for `size`, must not be `None`")  # noqa: E501

        self._size = size

    @property
    def virtual_size(self) -> int:
        """Gets the virtual_size of this Image.


        :return: The virtual_size of this Image.
        :rtype: int
        """
        return self._virtual_size

    @virtual_size.setter
    def virtual_size(self, virtual_size: int):
        """Sets the virtual_size of this Image.


        :param virtual_size: The virtual_size of this Image.
        :type virtual_size: int
        """
        if virtual_size is None:
            raise ValueError("Invalid value for `virtual_size`, must not be `None`")  # noqa: E501

        self._virtual_size = virtual_size
