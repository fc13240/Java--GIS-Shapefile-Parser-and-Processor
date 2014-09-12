package containers.ergo.geometry;

import java.util.Collection;
import java.util.List;

import containers.metadata.MetadataStore;


/**
 * Custom container class for objects containing 1++ MyVertex objects (stored in a collection). 
 * Supports storing metadata in a HashMap through a MetadataStore.
 * @author Michael Fotiadis
 *
 */
public class ErgoPolyline extends MetadataStore {

	private final Collection<ErgoVertex> vertexList;
	private final String id;
	private final String type;
	private int hasmhapSize = 0;
	private String mReferenceSystem;

	public <T extends Collection<ErgoVertex>> ErgoPolyline (T vertexList) {
		this.vertexList = vertexList;
		this.id = null;
		this.type = null;
	}


	public <T extends Collection<ErgoVertex>> ErgoPolyline (T vertexList, String id) {
		this.vertexList = vertexList;
		this.id = id;
		this.type = null;
	}

	public <T extends Collection<ErgoVertex>> ErgoPolyline (T vertexList, String id, String type) {
		this.vertexList = vertexList;
		this.id = id;
		this.type = type;
	}

	public void setHashMapSize() {
		this.hasmhapSize ++;
	}
	
	public int getHashMapSize() {
		return hasmhapSize;
	}

	public Collection<ErgoVertex> getVertexList() {
		return vertexList;
	}

	public ErgoVertex getVertex(int vertexIndex) {
		return ((List<ErgoVertex>) vertexList).get(vertexIndex);
	}

	public String getID() {
		return id;
	}


	public String getType() {
		return type;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErgoPolyline other = (ErgoPolyline) obj;
		if (vertexList == null) {
			if (other.vertexList  != null)
				return false;
		} else if (!vertexList .equals(other.vertexList ))
			return false;
		return true;
		
	}

	public String getReferenceSystem() {
		return mReferenceSystem;
	}


	public void setReferenceSystem(String mReferenceSystem) {
		this.mReferenceSystem = mReferenceSystem;
	}
}
